package typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreFactoryMod

import typingsSlinky.atAngularCompiler.atAngularCompilerStrings.invalid
import typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryDelegateType.Class
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryDelegateType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFnOrClassMetadata extends R3ConstructorFactoryMetadata {
  var delegate: Expression
  var delegateDeps: js.Array[R3DependencyMetadata]
  var delegateType: Class | Function
}

object R3DelegatedFnOrClassMetadata {
  @scala.inline
  def apply(
    delegate: Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: Class | Function,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3DelegatedFnOrClassMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFnOrClassMetadata]
  }
}

