fun main() {
    //4.7 Практическая работа
    var firstNameString = "Sergey"
    var lastNameString = "Gulevich"
    var height: Double = 181.5
    var weight: Float = 85F
    var isChild = height < 150

    var info =
        "My Name is $firstNameString \nMy Surname is $lastNameString \nMy height is $height \nMy weight is $weight \nI`am child ${isChild} "
    println(info)

/*
    //4_lesson ПЕРЕМЕННЫЕ
    //4.2 Типы данных. Числа, операции с числами
    val number: Int = 10000
    val floatNumber: Float = 2.0f
    val longNumber: Long = number.toLong()
    val a = 5
    val b = 11
    println("a+b=${a + b}")
    println("a-b=${a - b}")
    println("a*b=${a * b}")
    println("a/b=${b / a.toDouble()}")
    println("b%a=${b % a}")

    //4.3 Типы данных. Логический тип
    var numberForChek = 5
    var isPositive = numberForChek > 0
    var isEven = numberForChek % 2 == 0
    println("Is number positive or even? - ${isPositive || isEven}")
    numberForChek = 10
    isPositive = numberForChek > 0
    isEven = numberForChek % 2 == 0
    println("Is number positive or even? - ${isPositive || isEven}")

    //4.4 Типы данных. Символы
    val character: Char = 'A'
    println(character.toInt())
    val charC = character + 2
    println(charC)

    //4.5 Типы данных. Строки
    val escapedString = "Hello\nWorld"
    println(escapedString)
    val commonString = """Hello
        |kotlin
        |This is a
        |common string
    """.trimMargin()
    println(commonString)
    val hello = "Kotlin"
    println(hello + "hello")
    println(hello.toUpperCase())
    println(hello)
    //Длинна строки %str% - %length% символов
    val longStr = "The longest string you`ve ever seen"
    //First variant
    val resulString = "Lenght of " + "\"" + longStr + "\"" + longStr.length + " symbols"
    println(resulString)
    //Second variant
    val resultString2 = "Lenght of $longStr - ${longStr.length} symbols"
    println(resultString2)
    // string contains
    val str = "Hello Kotlin"
    println(str.contains(other = "H"))
    println(str.contains(other = "Kotlin"))
    println(str.contains(other = "world"))
    // replace
    println(str.replace(oldValue = "l", newValue = "2"))
    val replaceFirst = str.replaceFirst(oldValue = "Hello", newValue = "First")
    println(replaceFirst)

    //4.6 Типы данных. Nullable типы. NullSafety
    var number: Int? = null
    var nonNullString: String = "Hello Kotlin"
    var nullableString: String? = "Hello Kotlin 2"
    println(nullableString?.toUpperCase())
    if (nullableString != null)
        println(nullableString.toUpperCase())
    */
}