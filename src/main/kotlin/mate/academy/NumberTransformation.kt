package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULTIPLIER = 3
const val ADDITION = 10
const val REMAINDER_FROM = 11

fun getReminder(numberStr: String?) : Int? {
    val number = if (numberStr != "") numberStr?.toInt() else null
    return number
        ?.times(MULTIPLIER)
        ?.plus(ADDITION)
        ?.rem(REMAINDER_FROM)
}
