package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAppsyncMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.awsDashSdk.awsDashSdkStrings.AWS_IAM
  import typingsSlinky.awsDashSdk.awsDashSdkStrings.RDS_HTTP_ENDPOINT
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typingsSlinky.node.Buffer

  type AdditionalAuthenticationProviders = js.Array[AdditionalAuthenticationProvider]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.MODIFYING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ApiCacheStatus = _ApiCacheStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.T2_SMALL
    - typings.awsDashSdk.awsDashSdkStrings.T2_MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.R4_LARGE
    - typings.awsDashSdk.awsDashSdkStrings.R4_XLARGE
    - typings.awsDashSdk.awsDashSdkStrings.R4_2XLARGE
    - typings.awsDashSdk.awsDashSdkStrings.R4_4XLARGE
    - typings.awsDashSdk.awsDashSdkStrings.R4_8XLARGE
    - java.lang.String
  */
  type ApiCacheType = _ApiCacheType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL_REQUEST_CACHING
    - typings.awsDashSdk.awsDashSdkStrings.PER_RESOLVER_CACHING
    - java.lang.String
  */
  type ApiCachingBehavior = _ApiCachingBehavior | java.lang.String
  type ApiKeys = js.Array[ApiKey]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.API_KEY
    - typings.awsDashSdk.awsDashSdkStrings.AWS_IAM
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_COGNITO_USER_POOLS
    - typings.awsDashSdk.awsDashSdkStrings.OPENID_CONNECT
    - java.lang.String
  */
  type AuthenticationType = _AuthenticationType | java.lang.String
  type AuthorizationType = AWS_IAM | java.lang.String
  type Boolean = scala.Boolean
  type BooleanValue = scala.Boolean
  type CachingKeys = js.Array[String]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VERSION
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type ConflictDetectionType = _ConflictDetectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OPTIMISTIC_CONCURRENCY
    - typings.awsDashSdk.awsDashSdkStrings.LAMBDA
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMERGE
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type ConflictHandlerType = _ConflictHandlerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS_LAMBDA
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_DYNAMODB
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_ELASTICSEARCH
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - typings.awsDashSdk.awsDashSdkStrings.RELATIONAL_DATABASE
    - java.lang.String
  */
  type DataSourceType = _DataSourceType | java.lang.String
  type DataSources = js.Array[DataSource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW
    - typings.awsDashSdk.awsDashSdkStrings.DENY
    - java.lang.String
  */
  type DefaultAction = _DefaultAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type FieldLogLevel = _FieldLogLevel | java.lang.String
  type Functions = js.Array[FunctionConfiguration]
  type FunctionsIds = js.Array[String]
  type GraphqlApis = js.Array[GraphqlApi]
  type Long = Double
  type MapOfStringToString = StringDictionary[String]
  type MappingTemplate = java.lang.String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SDL
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type OutputType = _OutputType | java.lang.String
  type PaginationToken = java.lang.String
  type RelationalDatabaseSourceType = RDS_HTTP_ENDPOINT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNIT
    - typings.awsDashSdk.awsDashSdkStrings.PIPELINE
    - java.lang.String
  */
  type ResolverKind = _ResolverKind | java.lang.String
  type Resolvers = js.Array[Resolver]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PROCESSING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.NOT_APPLICABLE
    - java.lang.String
  */
  type SchemaStatus = _SchemaStatus | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SDL
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type TypeDefinitionFormat = _TypeDefinitionFormat | java.lang.String
  type TypeList = js.Array[Type]
  type _Blob = Buffer | scala.scalajs.js.typedarray.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-07-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
