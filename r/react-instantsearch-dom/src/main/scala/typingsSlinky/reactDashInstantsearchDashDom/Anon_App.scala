package typingsSlinky.reactDashInstantsearchDashDom

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var InstantSearch: ReactComponentClass[_]
  def findResultsState(App: ReactComponentClass[_], props: js.Any): js.Promise[_]
}

object Anon_App {
  @scala.inline
  def apply(
    InstantSearch: ReactComponentClass[_],
    findResultsState: (ReactComponentClass[_], js.Any) => js.Promise[_]
  ): Anon_App = {
    val __obj = js.Dynamic.literal(InstantSearch = InstantSearch.asInstanceOf[js.Any], findResultsState = js.Any.fromFunction2(findResultsState))
  
    __obj.asInstanceOf[Anon_App]
  }
}

