package typingsSlinky.atJupyterlabDocumentsearch.libTokensMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProvider
import typingsSlinky.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProviderConstructor
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchProviderRegistry extends js.Object {
  /**
    * Signal that emits when a new search provider has been registered
    * or removed.
    */
  var changed: ISignal[ISearchProviderRegistry, Unit]
  /**
    * Returns a matching provider for the widget.
    *
    * @param widget - The widget to search over.
    * @returns the search provider, or undefined if none exists.
    */
  def getProviderForWidget(widget: js.Any): js.UndefOr[ISearchProvider[_]]
  /**
    * Add a provider to the registry.
    *
    * @param key - The provider key.
    * @returns A disposable delegate that, when disposed, deregisters the given search provider
    */
  def register(key: String, provider: ISearchProviderConstructor[_]): IDisposable
}

@JSImport("@jupyterlab/documentsearch/lib/tokens", "ISearchProviderRegistry")
@js.native
object ISearchProviderRegistry extends TopLevel[Token[ISearchProviderRegistry]]

