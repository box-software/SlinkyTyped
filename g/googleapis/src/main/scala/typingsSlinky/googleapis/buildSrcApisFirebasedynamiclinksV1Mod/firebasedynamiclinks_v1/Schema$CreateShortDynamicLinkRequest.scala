package typingsSlinky.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a short Dynamic Link.
  */
@js.native
trait Schema$CreateShortDynamicLinkRequest extends js.Object {
  /**
    * Information about the Dynamic Link to be shortened. [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var dynamicLinkInfo: js.UndefOr[Schema$DynamicLinkInfo] = js.native
  /**
    * Full long Dynamic Link URL with desired query parameters specified. For
    * example,
    * &quot;https://sample.app.goo.gl/?link=http://www.google.com&amp;apn=com.sample&quot;,
    * [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var longDynamicLink: js.UndefOr[String] = js.native
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
  /**
    * Short Dynamic Link suffix. Optional.
    */
  var suffix: js.UndefOr[Schema$Suffix] = js.native
}

object Schema$CreateShortDynamicLinkRequest {
  @scala.inline
  def apply(
    dynamicLinkInfo: Schema$DynamicLinkInfo = null,
    longDynamicLink: String = null,
    sdkVersion: String = null,
    suffix: Schema$Suffix = null
  ): Schema$CreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    if (dynamicLinkInfo != null) __obj.updateDynamic("dynamicLinkInfo")(dynamicLinkInfo.asInstanceOf[js.Any])
    if (longDynamicLink != null) __obj.updateDynamic("longDynamicLink")(longDynamicLink.asInstanceOf[js.Any])
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateShortDynamicLinkRequest]
  }
}

