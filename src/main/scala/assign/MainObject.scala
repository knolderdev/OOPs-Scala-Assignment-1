package assign

import java.util.Scanner
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks.{break, breakable}

object MainObject {
  def main(args: Array[String]): Unit = {


    val queue = new ListBuffer[Int]
    breakable {
      while (true) {
        println("\nPress")
        println("1. Insert Double of an element")
        println("2. Insert square of an element")
        println("3. Delete an element")
        println("4. Display the Queue")
        println("5. Exit out")
        val sc = new Scanner(System.in)
        val choice = sc.nextInt()
        choice match {
          case 1 =>
            println("\nEnter the Element to be Pushed")
            val elementToBePushed = sc.nextInt()
            val queueObj = new DoubleQueue(queue)
            queueObj.enqueue(elementToBePushed)

          case 2 =>
            println("\nEnter the Element to be Pushed")
            val elementToBePushed = sc.nextInt()
            val queueObj = new SquareQueue(queue)
            queueObj.enqueue(elementToBePushed)
          case 3 =>

            if (queue.size == 0) println("\nThere are no elements in the Queue")
            else {
              val obj = new SquareQueue(queue)
              val poppedElement = obj.dequeue(queue)
              println("Deleted Element is : " + poppedElement)
            }
          case 4 => 1
            if (queue.size == 0) println("\nThere are no elements in the Queue")
            else {
              println("\n Queue")
              for (loopVariable <- queue)
                print(loopVariable + " ")
              println()

            }
          case 5 =>
            println("Exiting Out. Bye Bye !!!")
            break
          case _ =>
            println("You have entered the Wrong Choice. Please try again")
        }
      }
    }
  }
}

