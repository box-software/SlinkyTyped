package typingsSlinky.atAngularCommon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAngularCommon.atAngularCommonStrings.arraybuffer
import typingsSlinky.atAngularCommon.atAngularCommonStrings.events
import typingsSlinky.atAngularCommon.httpHttpMod.HttpHeaders
import typingsSlinky.atAngularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArraybufferEvents extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var observe: events
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  var responseType: arraybuffer
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_ArraybufferEvents {
  @scala.inline
  def apply(
    observe: events,
    responseType: arraybuffer,
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    params: HttpParams | (StringDictionary[String | js.Array[String]]) = null,
    reportProgress: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Anon_ArraybufferEvents = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArraybufferEvents]
  }
}

