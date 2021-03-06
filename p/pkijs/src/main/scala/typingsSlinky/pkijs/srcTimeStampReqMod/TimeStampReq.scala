package typingsSlinky.pkijs.srcTimeStampReqMod

import typingsSlinky.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeStampReq extends js.Object {
  var certReq: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[typingsSlinky.pkijs.srcExtensionMod.default]] = js.undefined
  var messageImprint: typingsSlinky.pkijs.srcMessageImprintMod.default
  var nonce: js.UndefOr[Integer] = js.undefined
  var reqPolicy: js.UndefOr[String] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object TimeStampReq {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    messageImprint: typingsSlinky.pkijs.srcMessageImprintMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    certReq: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[typingsSlinky.pkijs.srcExtensionMod.default] = null,
    nonce: Integer = null,
    reqPolicy: String = null
  ): TimeStampReq = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), messageImprint = messageImprint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(certReq)) __obj.updateDynamic("certReq")(certReq.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (reqPolicy != null) __obj.updateDynamic("reqPolicy")(reqPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStampReq]
  }
}

