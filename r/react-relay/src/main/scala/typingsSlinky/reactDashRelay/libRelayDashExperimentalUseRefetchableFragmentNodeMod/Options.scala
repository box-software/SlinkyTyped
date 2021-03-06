package typingsSlinky.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod

import typingsSlinky.reactDashRelay.libRelayDashExperimentalQueryResourceMod.FetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(fetchPolicy: FetchPolicy = null, onComplete: /* arg */ js.Error | Null => Unit = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[Options]
  }
}

