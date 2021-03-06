package typingsSlinky.forkDashTsDashCheckerDashWebpackDashPlugin.libIncrementalCheckerInterfaceMod

import typingsSlinky.forkDashTsDashCheckerDashWebpackDashPlugin.Anon_Filepath
import typingsSlinky.forkDashTsDashCheckerDashWebpackDashPlugin.Typeofts
import typingsSlinky.forkDashTsDashCheckerDashWebpackDashPlugin.libNormalizedMessageMod.NormalizedMessage
import typingsSlinky.std.ReturnType
import typingsSlinky.tslint.tslintMod.RuleFailure
import typingsSlinky.typescript.typescriptMod.CompilerOptions
import typingsSlinky.typescript.typescriptMod.Diagnostic
import typingsSlinky.typescript.typescriptMod.ModuleResolutionHost
import typingsSlinky.typescript.typescriptMod.ResolvedModuleWithFailedLookupLocations
import typingsSlinky.typescript.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalCheckerParams extends ApiIncrementalCheckerParams {
  var vue: Boolean
  var watchPaths: js.Array[String]
  var workDivision: Double
  var workNumber: Double
}

object IncrementalCheckerParams {
  @scala.inline
  def apply(
    checkSyntacticErrors: Boolean,
    compilerOptions: CompilerOptions,
    context: String,
    createNormalizedMessageFromDiagnostic: Diagnostic => NormalizedMessage,
    createNormalizedMessageFromRuleFailure: RuleFailure => NormalizedMessage,
    linterAutoFix: Boolean,
    linterConfigFile: String | Boolean,
    programConfigFile: String,
    typescript: Typeofts,
    vue: Boolean,
    watchPaths: js.Array[String],
    workDivision: Double,
    workNumber: Double,
    eslinter: ReturnType[js.Function1[/* eslintOptions */ js.Object, Anon_Filepath]] = null,
    resolveModuleName: (/* typescript */ Typeofts, /* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedModuleWithFailedLookupLocations = null,
    resolveTypeReferenceDirective: (/* typescript */ Typeofts, /* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations = null
  ): IncrementalCheckerParams = {
    val __obj = js.Dynamic.literal(checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createNormalizedMessageFromDiagnostic = js.Any.fromFunction1(createNormalizedMessageFromDiagnostic), createNormalizedMessageFromRuleFailure = js.Any.fromFunction1(createNormalizedMessageFromRuleFailure), linterAutoFix = linterAutoFix.asInstanceOf[js.Any], linterConfigFile = linterConfigFile.asInstanceOf[js.Any], programConfigFile = programConfigFile.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], watchPaths = watchPaths.asInstanceOf[js.Any], workDivision = workDivision.asInstanceOf[js.Any], workNumber = workNumber.asInstanceOf[js.Any])
    if (eslinter != null) __obj.updateDynamic("eslinter")(eslinter.asInstanceOf[js.Any])
    if (resolveModuleName != null) __obj.updateDynamic("resolveModuleName")(js.Any.fromFunction5(resolveModuleName))
    if (resolveTypeReferenceDirective != null) __obj.updateDynamic("resolveTypeReferenceDirective")(js.Any.fromFunction5(resolveTypeReferenceDirective))
    __obj.asInstanceOf[IncrementalCheckerParams]
  }
}

