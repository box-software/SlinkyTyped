package typingsSlinky.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tag Settings
  */
@js.native
trait Schema$TagSetting extends js.Object {
  /**
    * Additional key-values to be included in tags. Each key-value pair must be
    * of the form key=value, and pairs must be separated by a semicolon (;).
    * Keys and values must not contain commas. For example, id=2;color=red is a
    * valid value for this field.
    */
  var additionalKeyValues: js.UndefOr[String] = js.native
  /**
    * Whether static landing page URLs should be included in the tags. This
    * setting applies only to placements.
    */
  var includeClickThroughUrls: js.UndefOr[Boolean] = js.native
  /**
    * Whether click-tracking string should be included in the tags.
    */
  var includeClickTracking: js.UndefOr[Boolean] = js.native
  /**
    * Option specifying how keywords are embedded in ad tags. This setting can
    * be used to specify whether keyword placeholders are inserted in placement
    * tags for this site. Publishers can then add keywords to those
    * placeholders.
    */
  var keywordOption: js.UndefOr[String] = js.native
}

object Schema$TagSetting {
  @scala.inline
  def apply(
    additionalKeyValues: String = null,
    includeClickThroughUrls: js.UndefOr[Boolean] = js.undefined,
    includeClickTracking: js.UndefOr[Boolean] = js.undefined,
    keywordOption: String = null
  ): Schema$TagSetting = {
    val __obj = js.Dynamic.literal()
    if (additionalKeyValues != null) __obj.updateDynamic("additionalKeyValues")(additionalKeyValues.asInstanceOf[js.Any])
    if (!js.isUndefined(includeClickThroughUrls)) __obj.updateDynamic("includeClickThroughUrls")(includeClickThroughUrls.asInstanceOf[js.Any])
    if (!js.isUndefined(includeClickTracking)) __obj.updateDynamic("includeClickTracking")(includeClickTracking.asInstanceOf[js.Any])
    if (keywordOption != null) __obj.updateDynamic("keywordOption")(keywordOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TagSetting]
  }
}

