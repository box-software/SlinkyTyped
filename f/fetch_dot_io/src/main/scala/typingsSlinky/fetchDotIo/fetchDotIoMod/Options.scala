package typingsSlinky.fetchDotIo.fetchDotIoMod

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends RequestInit {
  var afterJSON: js.UndefOr[js.Function1[/* body */ js.Any, Unit]] = js.undefined
  var afterResponse: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.undefined
  var beforeRequest: js.UndefOr[js.Function2[/* url */ TUrl, /* body */ BodyInit, Boolean | Unit]] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterJSON: /* body */ js.Any => Unit = null,
    afterResponse: /* res */ Response => Unit = null,
    beforeRequest: (/* url */ TUrl, /* body */ BodyInit) => Boolean | Unit = null,
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    header: Header = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    prefix: String = null,
    query: Query = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    signal: AbortSignal = null,
    window: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterJSON != null) __obj.updateDynamic("afterJSON")(js.Any.fromFunction1(afterJSON))
    if (afterResponse != null) __obj.updateDynamic("afterResponse")(js.Any.fromFunction1(afterResponse))
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(js.Any.fromFunction2(beforeRequest))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

