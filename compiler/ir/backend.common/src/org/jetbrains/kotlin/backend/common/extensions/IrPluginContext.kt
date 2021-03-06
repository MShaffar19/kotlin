/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.backend.common.extensions

import org.jetbrains.kotlin.backend.common.ir.BuiltinSymbolsBase
import org.jetbrains.kotlin.config.LanguageVersionSettings
import org.jetbrains.kotlin.descriptors.ModuleDescriptor
import org.jetbrains.kotlin.ir.builders.IrGeneratorContext
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol
import org.jetbrains.kotlin.ir.util.ReferenceSymbolTable
import org.jetbrains.kotlin.ir.util.TypeTranslator
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.resolve.BindingContext

interface IrPluginContext : IrGeneratorContext {
    val languageVersionSettings: LanguageVersionSettings

    @Deprecated("FrontEnd API shouldn't be accessed in Ir plugin environment")
    val moduleDescriptor: ModuleDescriptor

    @Deprecated("FrontEnd API shouldn't be accessed in Ir plugin environment")
    val bindingContext: BindingContext

    @Deprecated("FrontEnd API shouldn't be accessed in Ir plugin environment")
    val symbolTable: ReferenceSymbolTable

    @Deprecated("FrontEnd API shouldn't be accessed in Ir plugin environment")
    val typeTranslator: TypeTranslator

    val symbols: BuiltinSymbolsBase

    // The following API is experimental
    fun referenceClass(fqName: FqName): IrClassSymbol?
    fun referenceConstructors(classFqn: FqName): Collection<IrConstructorSymbol>
    fun referenceFunctions(fqName: FqName): Collection<IrSimpleFunctionSymbol>
    fun referenceProperties(fqName: FqName): Collection<IrPropertySymbol>
}

