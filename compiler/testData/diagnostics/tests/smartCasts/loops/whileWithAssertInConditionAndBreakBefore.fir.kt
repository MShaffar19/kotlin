// !LANGUAGE: -SoundSmartcastFromLoopConditionForLoopAssignedVariables

fun foo() {
    var x: String? = "123"
    while (x!!.length < 42) {
        x = null
        break

    }
    x.<!UNRESOLVED_REFERENCE!>length<!> // 'x' is unsoundly smartcasted here
}

fun bar() {
    var x: List<Int>? = ArrayList<Int>(1)
    for (i in x!!) {
        x = null
        break

    }
    x.<!UNRESOLVED_REFERENCE!>size<!> // 'x' is unsoundly smartcasted here
}