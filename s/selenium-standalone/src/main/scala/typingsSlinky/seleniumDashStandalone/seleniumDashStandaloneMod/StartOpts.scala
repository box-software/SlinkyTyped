package typingsSlinky.seleniumDashStandalone.seleniumDashStandaloneMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptions
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.urlMod.URL
import typingsSlinky.seleniumDashStandalone.Anon_Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOpts extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var cb: js.UndefOr[js.Function2[/* error */ js.Error, /* child */ ChildProcess, Unit]] = js.undefined
  var drivers: js.UndefOr[StringDictionary[Anon_Arch]] = js.undefined
  var javaArgs: js.UndefOr[js.Array[String]] = js.undefined
  var javaPath: js.UndefOr[String] = js.undefined
  var requestOpts: js.UndefOr[RequestOptions | String | URL] = js.undefined
  var seleniumArgs: js.UndefOr[js.Array[String]] = js.undefined
  var spawnCb: js.UndefOr[js.Function1[/* selenium */ js.UndefOr[ChildProcess], Unit]] = js.undefined
  var spawnOptions: js.UndefOr[SpawnOptions] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object StartOpts {
  @scala.inline
  def apply(
    basePath: String = null,
    cb: (/* error */ js.Error, /* child */ ChildProcess) => Unit = null,
    drivers: StringDictionary[Anon_Arch] = null,
    javaArgs: js.Array[String] = null,
    javaPath: String = null,
    requestOpts: RequestOptions | String | URL = null,
    seleniumArgs: js.Array[String] = null,
    spawnCb: /* selenium */ js.UndefOr[ChildProcess] => Unit = null,
    spawnOptions: SpawnOptions = null,
    version: String = null
  ): StartOpts = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction2(cb))
    if (drivers != null) __obj.updateDynamic("drivers")(drivers.asInstanceOf[js.Any])
    if (javaArgs != null) __obj.updateDynamic("javaArgs")(javaArgs.asInstanceOf[js.Any])
    if (javaPath != null) __obj.updateDynamic("javaPath")(javaPath.asInstanceOf[js.Any])
    if (requestOpts != null) __obj.updateDynamic("requestOpts")(requestOpts.asInstanceOf[js.Any])
    if (seleniumArgs != null) __obj.updateDynamic("seleniumArgs")(seleniumArgs.asInstanceOf[js.Any])
    if (spawnCb != null) __obj.updateDynamic("spawnCb")(js.Any.fromFunction1(spawnCb))
    if (spawnOptions != null) __obj.updateDynamic("spawnOptions")(spawnOptions.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOpts]
  }
}

