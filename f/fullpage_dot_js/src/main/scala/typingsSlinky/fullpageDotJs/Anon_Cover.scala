package typingsSlinky.fullpageDotJs

import typingsSlinky.fullpageDotJs.fullpageDotJsStrings.cover
import typingsSlinky.fullpageDotJs.fullpageDotJsStrings.reveal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cover extends js.Object {
  var percentage: js.UndefOr[Double] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[cover | reveal] = js.undefined
}

object Anon_Cover {
  @scala.inline
  def apply(percentage: Int | Double = null, property: String = null, `type`: cover | reveal = null): Anon_Cover = {
    val __obj = js.Dynamic.literal()
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cover]
  }
}

