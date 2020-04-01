/*
 * KOTLIN DIAGNOSTICS SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-100
 * MAIN LINK: expressions, constant-literals, real-literals -> paragraph 4 -> sentence 1
 * NUMBER: 3
 * DESCRIPTION: Real literals suffixed by f/F (float suffix) with an exponent mark and underscores in a whole-number part, a fraction part and an exponent part.
 */

// TESTCASE NUMBER: 1
val value_1 = 0.0_0e1_0f

// TESTCASE NUMBER: 2
val value_2 = 0.0__0e-0___0

// TESTCASE NUMBER: 3
val value_3 = 0.0_0E-0__0_0F

// TESTCASE NUMBER: 4
val value_4 = 0__0.0e0f

// TESTCASE NUMBER: 5
val value_5 = 0_0_0.0_0E0_0

// TESTCASE NUMBER: 6
val value_6 = 00_______________00.0_0e+0_0

// TESTCASE NUMBER: 7
val value_7 = 2_2.0e1_0F

// TESTCASE NUMBER: 8
val value_8 = 33__3.0e10__0

// TESTCASE NUMBER: 9
val value_9 = 4_44____4.0E0______00F

// TESTCASE NUMBER: 10
val value_10 = 5_________555_________5.0e-9

// TESTCASE NUMBER: 11
val value_11 = 666_666.0__________________________________________________1E+2___________________________________________________________________0F

// TESTCASE NUMBER: 12
val value_12 = 7777777.0_0e3_0

// TESTCASE NUMBER: 13
val value_13 = 8888888_8.000e0f

// TESTCASE NUMBER: 14
val value_14 = 9_______9______9_____9____9___9__9_9.0E-1

// TESTCASE NUMBER: 15
val value_15 = <!FLOAT_LITERAL_CONFORMS_INFINITY!>0_0_0_0_0_0_0_0_0_0.12345678e+90F<!>

// TESTCASE NUMBER: 16
val value_16 = 1_2_3_4_5_6_7_8_9.2_3_4_5_6_7_8_9e-0

// TESTCASE NUMBER: 17
val value_17 = <!FLOAT_LITERAL_CONFORMS_INFINITY!>234_5_678.345______________6e7_______8f<!>

// TESTCASE NUMBER: 18
val value_18 = 3_456_7.45_6E7f

// TESTCASE NUMBER: 19
val value_19 = 456.5e0_6

// TESTCASE NUMBER: 20
val value_20 = 5.6_0E+05F

// TESTCASE NUMBER: 21
val value_21 = 6_54.76_5e-4

// TESTCASE NUMBER: 22
val value_22 = <!FLOAT_LITERAL_CONFORMS_INFINITY!>7_6543.8E7654_3<!>

// TESTCASE NUMBER: 23
val value_23 = <!FLOAT_LITERAL_CONFORMS_INFINITY!>876543_____________2.9E+0_____________8765432f<!>

// TESTCASE NUMBER: 24
val value_24 = <!FLOAT_LITERAL_CONFORMS_ZERO!>9_____________87654321.0e-9_8765432_____________1F<!>

// TESTCASE NUMBER: 25
val value_25 = 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000___0.000000000000000000000000e000000000000000000000000000000000000000000000000000000000000000_0F

// TESTCASE NUMBER: 26
val value_26 = 0_000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0E-0___000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

// TESTCASE NUMBER: 27
val value_27 = <!FLOAT_LITERAL_CONFORMS_INFINITY!>9999999999999999999999999999999999999999999_______________999999999999999999999999999999999999999999999.33333333333333333333333333333333333333333333333_333333333333333333333333333333333333333e3_3f<!>
