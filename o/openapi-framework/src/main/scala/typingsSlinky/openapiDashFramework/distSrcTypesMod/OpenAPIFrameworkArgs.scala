package typingsSlinky.openapiDashFramework.distSrcTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openapiDashFramework.Anon_String
import typingsSlinky.openapiDashSecurityDashHandler.openapiDashSecurityDashHandlerMod.SecurityHandlers
import typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.Document
import typingsSlinky.tsDashLog.tsDashLogMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkArgs extends js.Object {
  var apiDoc: Document | typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.Document | String
  var customFormats: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var enableObjectCoercion: js.UndefOr[Boolean] = js.undefined
  var errorTransformer: js.UndefOr[OpenAPIErrorTransformer] = js.undefined
  var externalSchemas: js.UndefOr[Anon_String] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var operations: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.undefined
  var pathSecurity: js.UndefOr[js.Array[PathSecurityTuple]] = js.undefined
  var paths: js.UndefOr[String | js.Array[OpenAPIFrameworkPathObject]] = js.undefined
  var pathsIgnore: js.UndefOr[js.RegExp] = js.undefined
  var routesGlob: js.UndefOr[String] = js.undefined
  var routesIndexFileRegExp: js.UndefOr[js.RegExp] = js.undefined
  var securityHandlers: js.UndefOr[SecurityHandlers] = js.undefined
  var validateApiDoc: js.UndefOr[Boolean] = js.undefined
}

object OpenAPIFrameworkArgs {
  @scala.inline
  def apply(
    apiDoc: Document | typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.Document | String,
    customFormats: StringDictionary[js.Function1[/* arg */ js.Any, Boolean]] = null,
    dependencies: StringDictionary[js.Any] = null,
    enableObjectCoercion: js.UndefOr[Boolean] = js.undefined,
    errorTransformer: (/* has0 */ js.Object, /* has1 */ js.Object) => js.Object = null,
    externalSchemas: Anon_String = null,
    logger: Logger = null,
    operations: StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null,
    pathSecurity: js.Array[PathSecurityTuple] = null,
    paths: String | js.Array[OpenAPIFrameworkPathObject] = null,
    pathsIgnore: js.RegExp = null,
    routesGlob: String = null,
    routesIndexFileRegExp: js.RegExp = null,
    securityHandlers: SecurityHandlers = null,
    validateApiDoc: js.UndefOr[Boolean] = js.undefined
  ): OpenAPIFrameworkArgs = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any])
    if (customFormats != null) __obj.updateDynamic("customFormats")(customFormats.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(enableObjectCoercion)) __obj.updateDynamic("enableObjectCoercion")(enableObjectCoercion.asInstanceOf[js.Any])
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction2(errorTransformer))
    if (externalSchemas != null) __obj.updateDynamic("externalSchemas")(externalSchemas.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (pathSecurity != null) __obj.updateDynamic("pathSecurity")(pathSecurity.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (pathsIgnore != null) __obj.updateDynamic("pathsIgnore")(pathsIgnore.asInstanceOf[js.Any])
    if (routesGlob != null) __obj.updateDynamic("routesGlob")(routesGlob.asInstanceOf[js.Any])
    if (routesIndexFileRegExp != null) __obj.updateDynamic("routesIndexFileRegExp")(routesIndexFileRegExp.asInstanceOf[js.Any])
    if (securityHandlers != null) __obj.updateDynamic("securityHandlers")(securityHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(validateApiDoc)) __obj.updateDynamic("validateApiDoc")(validateApiDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFrameworkArgs]
  }
}

