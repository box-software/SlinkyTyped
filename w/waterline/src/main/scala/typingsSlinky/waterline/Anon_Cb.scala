package typingsSlinky.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb[T] extends js.Object {
  def exec(cb: js.Function2[/* err */ js.Error, /* result */ T, _]): Unit
}

object Anon_Cb {
  @scala.inline
  def apply[T](exec: js.Function2[/* err */ js.Error, /* result */ T, _] => Unit): Anon_Cb[T] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
  
    __obj.asInstanceOf[Anon_Cb[T]]
  }
}

