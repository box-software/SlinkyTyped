package typingsSlinky.atPulumiAws.appsyncGraphQLApiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atPulumiAws.typesOutputMod.appsync.GraphQLApiAdditionalAuthenticationProvider
import typingsSlinky.atPulumiAws.typesOutputMod.appsync.GraphQLApiLogConfig
import typingsSlinky.atPulumiAws.typesOutputMod.appsync.GraphQLApiOpenidConnectConfig
import typingsSlinky.atPulumiAws.typesOutputMod.appsync.GraphQLApiUserPoolConfig
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync/graphQLApi", "GraphQLApi")
@js.native
class GraphQLApi protected () extends CustomResource {
  /**
    * Create a GraphQLApi resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GraphQLApiArgs) = this()
  def this(name: String, args: GraphQLApiArgs, opts: CustomResourceOptions) = this()
  /**
    * One or more additional authentication providers for the GraphqlApi. Defined below.
    */
  val additionalAuthenticationProviders: Output[js.UndefOr[js.Array[GraphQLApiAdditionalAuthenticationProvider]]] = js.native
  /**
    * The ARN
    */
  val arn: Output[String] = js.native
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  val authenticationType: Output[String] = js.native
  /**
    * Nested argument containing logging configuration. Defined below.
    */
  val logConfig: Output[js.UndefOr[GraphQLApiLogConfig]] = js.native
  /**
    * A user-supplied name for the GraphqlApi.
    */
  val name: Output[String] = js.native
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  val openidConnectConfig: Output[js.UndefOr[GraphQLApiOpenidConnectConfig]] = js.native
  /**
    * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
    */
  val schema: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Map of URIs associated with the API. e.g. `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
    */
  val uris: Output[StringDictionary[String]] = js.native
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  val userPoolConfig: Output[js.UndefOr[GraphQLApiUserPoolConfig]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appsync/graphQLApi", "GraphQLApi")
@js.native
object GraphQLApi extends js.Object {
  /**
    * Get an existing GraphQLApi resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): GraphQLApi = js.native
  def get(name: String, id: Input[ID], state: GraphQLApiState): GraphQLApi = js.native
  def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): GraphQLApi = js.native
  /**
    * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = js.native
}

