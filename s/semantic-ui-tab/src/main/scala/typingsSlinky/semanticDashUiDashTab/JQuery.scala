package typingsSlinky.semanticDashUiDashTab

import typingsSlinky.semanticDashUiDashTab.SemanticUI.Tab
import typingsSlinky.semanticDashUiDashTab.SemanticUI.TabSettings
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabBooleans.`false`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.`cache add`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.`cache read`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.`cache remove`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.`change tab`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.`get path`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.`is tab`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.`set state`
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.destroy
import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("tab")
  var tab_Original: Tab = js.native
  def tab(): JQuery = js.native
  def tab(settings: TabSettings): JQuery = js.native
  /**
    * Sets cached HTML for path
    */
  @JSName("tab")
  def tab_cacheadd(behavior: `cache add`, path: String, html: String): JQuery = js.native
  /**
    * Returns cached HTML for path
    */
  @JSName("tab")
  def tab_cacheread(behavior: `cache read`, path: String): String | `false` = js.native
  /**
    * Removes cached HTML for path
    */
  @JSName("tab")
  def tab_cacheremove(behavior: `cache remove`, path: String): JQuery = js.native
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  @JSName("tab")
  def tab_changetab(behavior: `change tab`, path: String): JQuery = js.native
  @JSName("tab")
  def tab_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns current path
    */
  @JSName("tab")
  def tab_getpath(behavior: `get path`): String = js.native
  /**
    * Returns whether tab exists
    */
  @JSName("tab")
  def tab_istab(behavior: `is tab`): Boolean = js.native
  /**
    * Sets current path to state
    */
  @JSName("tab")
  def tab_setstate(behavior: `set state`, path: String): JQuery = js.native
  @JSName("tab")
  def tab_setting(behavior: setting, value: TabSettings): JQuery = js.native
  @JSName("tab")
  def tab_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any = js.native
  @JSName("tab")
  def tab_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

