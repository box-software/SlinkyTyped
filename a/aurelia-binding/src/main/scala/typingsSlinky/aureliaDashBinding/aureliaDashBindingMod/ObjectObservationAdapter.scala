package typingsSlinky.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectObservationAdapter extends js.Object {
  def getObserver(`object`: js.Any, propertyName: String, descriptor: js.PropertyDescriptor): js.UndefOr[InternalPropertyObserver | Null]
}

object ObjectObservationAdapter {
  @scala.inline
  def apply(
    getObserver: (js.Any, String, js.PropertyDescriptor) => js.UndefOr[InternalPropertyObserver | Null]
  ): ObjectObservationAdapter = {
    val __obj = js.Dynamic.literal(getObserver = js.Any.fromFunction3(getObserver))
  
    __obj.asInstanceOf[ObjectObservationAdapter]
  }
}

