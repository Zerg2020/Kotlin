fun main() {
    val sourceString = "F2p)v\"y233{0->c}ttelciFc"
    val uncryptOneString = sourceString.replaceRange(12..23, "")
                                       .map { Char -> Char + 1 }.joinToString()
                                       .replace("5", "s")
                                       .replace("4", "u")
                                       .replace(", ", "")
                                       .map { Char -> Char - 3 }.joinToString()
                                       .replace("0", "o")
                                       .replace(", ", "")
    val uncryptTwoString = sourceString.replaceRange(0..11, "")
                                       .reversed()
                                       .map {Char -> Char - 4}.joinToString()
                                       .replace("_"," " )
                                       .replace(", ","")

    println(uncryptOneString)
    println(uncryptTwoString)


    /* 5.3_v1 Тип Unit. Функциональный тип. Функции высшего порядка и лямбда-выражения
    val juniorGrossSalary = 50000
    val middleGrossSalary = 134000
    val seniorGrossSalary = 167000

    val juniorNetSalary = juniorGrossSalary * 0.87
    val juniorBank = juniorNetSalary * 0.3 * 12
    println("With a salary of $juniorGrossSalary person can accumulate $juniorBank in 1 year")

    val middleNetSalary = middleGrossSalary * 0.87
    val middleBank = middleNetSalary * 0.3 * 12
    println("With a salary of $middleGrossSalary person can accumulate $middleBank in 1 year")

    val seniorNetSalary = seniorGrossSalary * 0.87
    val seniorBank = seniorNetSalary * 0.3 * 12
    println("With a salary of $seniorGrossSalary person can accumulate $seniorBank in 1 year")
     */
    /* 5.3_v2 Тип Unit. Функциональный тип. Функции высшего порядка и лямбда-выражения

    val juniorGrossSalary = 50000
    val middleGrossSalary = 134000
    val seniorGrossSalary = 167000

    calculateSavings(juniorGrossSalary, rate = 0.3, period = 12)
    calculateSavings(middleGrossSalary, rate = 0.3, period = 12)
    calculateSavings(seniorGrossSalary, rate = 0.3, period = 12)
}
    fun calculateSavings (salary: Int, rate: Double = 0.3, period: Int = 12) : Double {
    val netSalary = salary * 0.87
    val bank = netSalary * rate * period
    println("Salary: $salary, rate${rate * 100}%, period: $period months, $bank in 1 year")
    return bank
     */
   /*5.3_v3 Тип Unit. Функциональный тип. Функции высшего порядка и лямбда-выражения
    val sum = calculateSavings(salary = 50000, rate = 0.3, period = 12) +
              calculateSavings(salary = 1340000, rate = 0.3, period = 12) +
              calculateSavings(salary = 167000, rate = 0.3, period = 12)
}
fun calculateSavings (salary: Int, rate: Double = 0.3, period: Int = 12) : Double {
    val netSalary = salary * 0.87
    val bank = netSalary * rate * period
    println("Salary: $salary, rate${rate * 100}%, period: $period months, $bank in 1 year")
    return bank

    */
}