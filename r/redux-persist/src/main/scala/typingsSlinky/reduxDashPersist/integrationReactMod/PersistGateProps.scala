package typingsSlinky.reduxDashPersist.integrationReactMod

import slinky.core.TagMod
import typingsSlinky.reduxDashPersist.esTypesMod.Persistor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see PersistGate */
trait PersistGateProps extends js.Object {
  var children: js.UndefOr[TagMod[Any] | (js.Function1[/* bootstrapped */ Boolean, TagMod[Any]])] = js.undefined
  var loading: js.UndefOr[TagMod[Any]] = js.undefined
  var onBeforeLift: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  var persistor: Persistor
}

object PersistGateProps {
  @scala.inline
  def apply(
    persistor: Persistor,
    children: TagMod[Any] | (js.Function1[/* bootstrapped */ Boolean, TagMod[Any]]) = null,
    loading: TagMod[Any] = null,
    onBeforeLift: () => Unit | js.Promise[Unit] = null
  ): PersistGateProps = {
    val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onBeforeLift != null) __obj.updateDynamic("onBeforeLift")(js.Any.fromFunction0(onBeforeLift))
    __obj.asInstanceOf[PersistGateProps]
  }
}

