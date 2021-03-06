package typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.payment

import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.PaymentResponse
import typingsSlinky.paypalDashRestDashSdk.paypalDashRestDashSdkMod.UpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.update")
@js.native
object update extends js.Object {
  def apply(id: String, data: js.Array[UpdateRequest]): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
  def apply(
    id: String,
    data: js.Array[UpdateRequest],
    config: RequestOptions,
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(
    id: String,
    data: js.Array[UpdateRequest],
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
}

