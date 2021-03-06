package typingsSlinky.atUifabricUtilities.libAsAsyncMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsAsyncOptions[TProps] extends js.Object {
  /**
    * Callback when async loading fails.
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Callback executed when async loading is complete.
    */
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback which returns a promise resolving an object which exports the component.
    */
  def load(): js.Promise[ReactComponentClass[TProps]]
}

object IAsAsyncOptions {
  @scala.inline
  def apply[TProps](
    load: () => js.Promise[ReactComponentClass[TProps]],
    onError: /* error */ js.Error => Unit = null,
    onLoad: () => Unit = null
  ): IAsAsyncOptions[TProps] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    __obj.asInstanceOf[IAsAsyncOptions[TProps]]
  }
}

