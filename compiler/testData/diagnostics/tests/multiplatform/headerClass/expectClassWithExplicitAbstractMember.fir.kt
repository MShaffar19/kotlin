// !LANGUAGE: +MultiPlatformProjects
// MODULE: m1-common
// FILE: common.kt

interface Foo {
    fun foo()
}

expect class NonAbstractClass : Foo {
    abstract fun bar()

    abstract val baz: Int

    abstract override fun foo()
}

expect abstract class AbstractClass : Foo {
    abstract fun bar()

    abstract val baz: Int

    abstract override fun foo()
}