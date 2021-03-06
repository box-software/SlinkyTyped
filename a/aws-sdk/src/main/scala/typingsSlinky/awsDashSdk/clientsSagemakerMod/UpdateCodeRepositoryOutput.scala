package typingsSlinky.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCodeRepositoryOutput extends js.Object {
  /**
    * The ARN of the Git repository.
    */
  var CodeRepositoryArn: typingsSlinky.awsDashSdk.clientsSagemakerMod.CodeRepositoryArn = js.native
}

object UpdateCodeRepositoryOutput {
  @scala.inline
  def apply(CodeRepositoryArn: CodeRepositoryArn): UpdateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateCodeRepositoryOutput]
  }
}

