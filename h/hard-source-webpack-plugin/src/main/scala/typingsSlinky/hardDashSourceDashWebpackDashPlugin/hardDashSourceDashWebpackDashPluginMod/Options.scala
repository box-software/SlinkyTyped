package typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginMod

import typingsSlinky.hardDashSourceDashWebpackDashPlugin.Anon_Debug
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.Anon_Directories
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.Anon_MaxAge
import typingsSlinky.webpack.webpackMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var cachePrune: js.UndefOr[Anon_MaxAge] = js.undefined
  var configHash: js.UndefOr[String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String])] = js.undefined
  var environmentHash: js.UndefOr[Anon_Directories] = js.undefined
  var info: js.UndefOr[Anon_Debug] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheDirectory: String = null,
    cachePrune: Anon_MaxAge = null,
    configHash: String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String]) = null,
    environmentHash: Anon_Directories = null,
    info: Anon_Debug = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (cachePrune != null) __obj.updateDynamic("cachePrune")(cachePrune.asInstanceOf[js.Any])
    if (configHash != null) __obj.updateDynamic("configHash")(configHash.asInstanceOf[js.Any])
    if (environmentHash != null) __obj.updateDynamic("environmentHash")(environmentHash.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

