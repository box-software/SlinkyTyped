package typingsSlinky.qrcode.qrcodeMod

import typingsSlinky.qrcode.Anon_Dark
import typingsSlinky.qrcode.qrcodeStrings.svg
import typingsSlinky.qrcode.qrcodeStrings.terminal
import typingsSlinky.qrcode.qrcodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToStringOptions extends QRCodeRenderersOptions {
  /**
    * Output format.
    * Default: utf8
    */
  var `type`: js.UndefOr[utf8 | svg | terminal] = js.undefined
}

object QRCodeToStringOptions {
  @scala.inline
  def apply(
    color: Anon_Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: Int | Double = null,
    scale: Int | Double = null,
    toSJISFunc: /* codePoint */ String => Double = null,
    `type`: utf8 | svg | terminal = null,
    version: Int | Double = null,
    width: Int | Double = null
  ): QRCodeToStringOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToStringOptions]
  }
}

