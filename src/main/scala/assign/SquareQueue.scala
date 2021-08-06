package assign

import scala.collection.mutable.ListBuffer

class SquareQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * elementToBePushed)
  }

}

class DoubleQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * 2)
  }

}
