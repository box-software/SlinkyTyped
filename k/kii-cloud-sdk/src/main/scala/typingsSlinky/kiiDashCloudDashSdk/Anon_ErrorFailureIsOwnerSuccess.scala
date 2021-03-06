package typingsSlinky.kiiDashCloudDashSdk

import typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiGroup
import typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsOwnerSuccess extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, user: KiiGroup, isOwner: Boolean): js.Any
}

object Anon_ErrorFailureIsOwnerSuccess {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiGroup, Boolean) => js.Any): Anon_ErrorFailureIsOwnerSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsOwnerSuccess]
  }
}

