package typingsSlinky.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaLambdaMixinsMod {
  import typingsSlinky.atPulumiAws.Anon_CodePathOptions
  import typingsSlinky.atPulumiAws.lambdaFunctionMod.Function
  import typingsSlinky.atPulumiAws.lambdaFunctionMod.FunctionArgs
  import typingsSlinky.atPulumiAws.utilsMod.Overwrite

  type BaseCallbackFunctionArgs = Overwrite[FunctionArgs, Anon_CodePathOptions]
  type Callback[E, R] = js.Function3[
    /* event */ E, 
    /* context */ Context, 
    /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
    js.Promise[R] | Unit
  ]
  type CallbackFactory[E, R] = js.Function0[Callback[E, R]]
  type EventHandler[E, R] = (Callback[E, R]) | Function
}
