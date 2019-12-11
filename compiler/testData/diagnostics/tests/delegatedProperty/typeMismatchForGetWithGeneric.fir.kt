// !DIAGNOSTICS: -UNUSED_PARAMETER

import kotlin.reflect.KProperty

class A

class B {
  val b: Int by Delegate<A>()
}

val bTopLevel: Int by Delegate<A>()

class C {
  val c: Int by Delegate<C>()
}

val cTopLevel: Int by Delegate<Nothing?>()

class Delegate<T> {
  operator fun getValue(t: T, p: KProperty<*>): Int {
    return 1
  }
}
