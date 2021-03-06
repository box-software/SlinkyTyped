package typingsSlinky.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy that specifies how requests intended for the route&#39;s backends
  * are shadowed to a separate mirrored backend service. Loadbalancer does not
  * wait for responses from the shadow service. Prior to sending traffic to the
  * shadow service, the host / authority header is suffixed with -shadow.
  */
@js.native
trait Schema$RequestMirrorPolicy extends js.Object {
  /**
    * The full or partial URL to the BackendService resource being mirrored to.
    */
  var backendService: js.UndefOr[String] = js.native
}

object Schema$RequestMirrorPolicy {
  @scala.inline
  def apply(backendService: String = null): Schema$RequestMirrorPolicy = {
    val __obj = js.Dynamic.literal()
    if (backendService != null) __obj.updateDynamic("backendService")(backendService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RequestMirrorPolicy]
  }
}

