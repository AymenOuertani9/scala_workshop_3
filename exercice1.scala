import scala.compiletime.ops.string
class Person() {
  var name: StringBuffer
  var age: Int
  var email: StringBuffer

  def greet(): Unit = {
    println("hello " + name + " with age " + age)
  }
}

class Rectangle() {
  var length: Double
  var height: Double

  def area(): Double = {
    return (length * height) / 2
  }

  def perimeter(): Double = {
    return (length + height) * 2
  }
}

class BankAccount() {
  var accountNumber: StringBuffer
  var balance: Double

  def deposit(amount: Double): Unit = {
    balance + = amount
    print(amount + " deposit successfully")
  }

  def withdraw(amount: Double): Unit = {
    balance - = amount
    print(amount + " withdraw successfully")
  }
}
