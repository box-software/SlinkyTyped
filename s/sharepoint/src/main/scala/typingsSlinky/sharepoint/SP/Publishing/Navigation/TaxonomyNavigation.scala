package typingsSlinky.sharepoint.SP.Publishing.Navigation

import typingsSlinky.sharepoint.SP.BooleanResult
import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.IntResult
import typingsSlinky.sharepoint.SP.Site
import typingsSlinky.sharepoint.SP.Taxonomy.Term
import typingsSlinky.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
@js.native
class TaxonomyNavigation () extends js.Object

/* static members */
@JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
@js.native
object TaxonomyNavigation extends js.Object {
  def flushSiteFromCache(context: ClientContext, site: Site): Unit = js.native
  def flushTermSetFromCache(context: ClientContext, webForPermissions: Web, termStoreId: Guid, termSetId: Guid): Unit = js.native
  def flushWebFromCache(context: ClientContext, web: Web): Unit = js.native
  def getNavigationLcidForWeb(context: ClientContext, web: Web): IntResult = js.native
  def getTermSetForWeb(context: ClientContext, web: Web, siteMapProviderName: String, includeInheritedSettings: Boolean): NavigationTermSet = js.native
  def getWebNavigationSettings(context: ClientContext, web: Web): WebNavigationSettings = js.native
  def setCrawlAsFriendlyUrlPage(context: ClientContext, navigationTerm: Term, crawlAsFriendlyUrlPage: Boolean): BooleanResult = js.native
}

