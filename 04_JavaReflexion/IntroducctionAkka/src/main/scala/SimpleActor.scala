import akka.actor.AbstractActor.Receive
import akka.actor.{ActorLogging, Props}


// TODO: All Bugs fixen when i star the programm

object SimpleActor {
   

  def props = Props[SimpleActor] // Good Manners
  case class PutTwice(s:String)
  case class Put(s:String)
  case object PrintAll

}

class SimpleActor extends Actor with ActorLogging{

  var list:List[String] = List.empty[String]

  override def receive: Receive = {
    // Recive

    case PutTwice(s) => list = s :: s :: list
    case Put(s) => list = s :: list
    case PrintAll => println(list.mkString(", "))
    case _ => log.error("not expected")

  }


}