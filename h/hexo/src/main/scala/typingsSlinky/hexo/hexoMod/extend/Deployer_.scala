package typingsSlinky.hexo.hexoMod.extend

import typingsSlinky.hexo.hexoMod.extend.Deployer.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Deployer")
trait Deployer_ extends js.Object {
  def register(name: String, fn: js.Function1[/* args */ Config, Unit]): Unit
}

object Deployer_ {
  @scala.inline
  def apply(register: (String, js.Function1[/* args */ Config, Unit]) => Unit): Deployer_ = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Deployer_]
  }
}

