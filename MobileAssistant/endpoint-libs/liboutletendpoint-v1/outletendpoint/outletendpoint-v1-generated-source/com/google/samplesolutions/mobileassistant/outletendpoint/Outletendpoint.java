/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2015-01-22 at 06:54:54 UTC 
 * Modify at your own risk.
 */

package com.google.samplesolutions.mobileassistant.outletendpoint;

/**
 * Service definition for Outletendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link OutletendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Outletendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the outletendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://graphic-theory-801.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "outletendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Outletendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Outletendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getOutlet".
   *
   * This request holds the parameters needed by the outletendpoint server.  After setting any
   * optional parameters, call the {@link GetOutlet#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetOutlet getOutlet(java.lang.Long id) throws java.io.IOException {
    GetOutlet result = new GetOutlet(id);
    initialize(result);
    return result;
  }

  public class GetOutlet extends OutletendpointRequest<com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet> {

    private static final String REST_PATH = "outlet/{id}";

    /**
     * Create a request for the method "getOutlet".
     *
     * This request holds the parameters needed by the the outletendpoint server.  After setting any
     * optional parameters, call the {@link GetOutlet#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetOutlet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetOutlet(java.lang.Long id) {
      super(Outletendpoint.this, "GET", REST_PATH, null, com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetOutlet setAlt(java.lang.String alt) {
      return (GetOutlet) super.setAlt(alt);
    }

    @Override
    public GetOutlet setFields(java.lang.String fields) {
      return (GetOutlet) super.setFields(fields);
    }

    @Override
    public GetOutlet setKey(java.lang.String key) {
      return (GetOutlet) super.setKey(key);
    }

    @Override
    public GetOutlet setOauthToken(java.lang.String oauthToken) {
      return (GetOutlet) super.setOauthToken(oauthToken);
    }

    @Override
    public GetOutlet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetOutlet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetOutlet setQuotaUser(java.lang.String quotaUser) {
      return (GetOutlet) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetOutlet setUserIp(java.lang.String userIp) {
      return (GetOutlet) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetOutlet setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetOutlet set(String parameterName, Object value) {
      return (GetOutlet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertOutlet".
   *
   * This request holds the parameters needed by the outletendpoint server.  After setting any
   * optional parameters, call the {@link InsertOutlet#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet}
   * @return the request
   */
  public InsertOutlet insertOutlet(com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet content) throws java.io.IOException {
    InsertOutlet result = new InsertOutlet(content);
    initialize(result);
    return result;
  }

  public class InsertOutlet extends OutletendpointRequest<com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet> {

    private static final String REST_PATH = "outlet";

    /**
     * Create a request for the method "insertOutlet".
     *
     * This request holds the parameters needed by the the outletendpoint server.  After setting any
     * optional parameters, call the {@link InsertOutlet#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertOutlet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet}
     * @since 1.13
     */
    protected InsertOutlet(com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet content) {
      super(Outletendpoint.this, "POST", REST_PATH, content, com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet.class);
    }

    @Override
    public InsertOutlet setAlt(java.lang.String alt) {
      return (InsertOutlet) super.setAlt(alt);
    }

    @Override
    public InsertOutlet setFields(java.lang.String fields) {
      return (InsertOutlet) super.setFields(fields);
    }

    @Override
    public InsertOutlet setKey(java.lang.String key) {
      return (InsertOutlet) super.setKey(key);
    }

    @Override
    public InsertOutlet setOauthToken(java.lang.String oauthToken) {
      return (InsertOutlet) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertOutlet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertOutlet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertOutlet setQuotaUser(java.lang.String quotaUser) {
      return (InsertOutlet) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertOutlet setUserIp(java.lang.String userIp) {
      return (InsertOutlet) super.setUserIp(userIp);
    }

    @Override
    public InsertOutlet set(String parameterName, Object value) {
      return (InsertOutlet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listOutlet".
   *
   * This request holds the parameters needed by the outletendpoint server.  After setting any
   * optional parameters, call the {@link ListOutlet#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListOutlet listOutlet() throws java.io.IOException {
    ListOutlet result = new ListOutlet();
    initialize(result);
    return result;
  }

  public class ListOutlet extends OutletendpointRequest<com.google.samplesolutions.mobileassistant.outletendpoint.model.CollectionResponseOutlet> {

    private static final String REST_PATH = "outlet";

    /**
     * Create a request for the method "listOutlet".
     *
     * This request holds the parameters needed by the the outletendpoint server.  After setting any
     * optional parameters, call the {@link ListOutlet#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListOutlet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListOutlet() {
      super(Outletendpoint.this, "GET", REST_PATH, null, com.google.samplesolutions.mobileassistant.outletendpoint.model.CollectionResponseOutlet.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListOutlet setAlt(java.lang.String alt) {
      return (ListOutlet) super.setAlt(alt);
    }

    @Override
    public ListOutlet setFields(java.lang.String fields) {
      return (ListOutlet) super.setFields(fields);
    }

    @Override
    public ListOutlet setKey(java.lang.String key) {
      return (ListOutlet) super.setKey(key);
    }

    @Override
    public ListOutlet setOauthToken(java.lang.String oauthToken) {
      return (ListOutlet) super.setOauthToken(oauthToken);
    }

    @Override
    public ListOutlet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListOutlet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListOutlet setQuotaUser(java.lang.String quotaUser) {
      return (ListOutlet) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListOutlet setUserIp(java.lang.String userIp) {
      return (ListOutlet) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListOutlet setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListOutlet setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListOutlet set(String parameterName, Object value) {
      return (ListOutlet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeOutlet".
   *
   * This request holds the parameters needed by the outletendpoint server.  After setting any
   * optional parameters, call the {@link RemoveOutlet#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveOutlet removeOutlet(java.lang.Long id) throws java.io.IOException {
    RemoveOutlet result = new RemoveOutlet(id);
    initialize(result);
    return result;
  }

  public class RemoveOutlet extends OutletendpointRequest<Void> {

    private static final String REST_PATH = "outlet/{id}";

    /**
     * Create a request for the method "removeOutlet".
     *
     * This request holds the parameters needed by the the outletendpoint server.  After setting any
     * optional parameters, call the {@link RemoveOutlet#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveOutlet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveOutlet(java.lang.Long id) {
      super(Outletendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveOutlet setAlt(java.lang.String alt) {
      return (RemoveOutlet) super.setAlt(alt);
    }

    @Override
    public RemoveOutlet setFields(java.lang.String fields) {
      return (RemoveOutlet) super.setFields(fields);
    }

    @Override
    public RemoveOutlet setKey(java.lang.String key) {
      return (RemoveOutlet) super.setKey(key);
    }

    @Override
    public RemoveOutlet setOauthToken(java.lang.String oauthToken) {
      return (RemoveOutlet) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveOutlet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveOutlet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveOutlet setQuotaUser(java.lang.String quotaUser) {
      return (RemoveOutlet) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveOutlet setUserIp(java.lang.String userIp) {
      return (RemoveOutlet) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveOutlet setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveOutlet set(String parameterName, Object value) {
      return (RemoveOutlet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateOutlet".
   *
   * This request holds the parameters needed by the outletendpoint server.  After setting any
   * optional parameters, call the {@link UpdateOutlet#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet}
   * @return the request
   */
  public UpdateOutlet updateOutlet(com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet content) throws java.io.IOException {
    UpdateOutlet result = new UpdateOutlet(content);
    initialize(result);
    return result;
  }

  public class UpdateOutlet extends OutletendpointRequest<com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet> {

    private static final String REST_PATH = "outlet";

    /**
     * Create a request for the method "updateOutlet".
     *
     * This request holds the parameters needed by the the outletendpoint server.  After setting any
     * optional parameters, call the {@link UpdateOutlet#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateOutlet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet}
     * @since 1.13
     */
    protected UpdateOutlet(com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet content) {
      super(Outletendpoint.this, "PUT", REST_PATH, content, com.google.samplesolutions.mobileassistant.outletendpoint.model.Outlet.class);
    }

    @Override
    public UpdateOutlet setAlt(java.lang.String alt) {
      return (UpdateOutlet) super.setAlt(alt);
    }

    @Override
    public UpdateOutlet setFields(java.lang.String fields) {
      return (UpdateOutlet) super.setFields(fields);
    }

    @Override
    public UpdateOutlet setKey(java.lang.String key) {
      return (UpdateOutlet) super.setKey(key);
    }

    @Override
    public UpdateOutlet setOauthToken(java.lang.String oauthToken) {
      return (UpdateOutlet) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateOutlet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateOutlet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateOutlet setQuotaUser(java.lang.String quotaUser) {
      return (UpdateOutlet) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateOutlet setUserIp(java.lang.String userIp) {
      return (UpdateOutlet) super.setUserIp(userIp);
    }

    @Override
    public UpdateOutlet set(String parameterName, Object value) {
      return (UpdateOutlet) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Outletendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Outletendpoint}. */
    @Override
    public Outletendpoint build() {
      return new Outletendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link OutletendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setOutletendpointRequestInitializer(
        OutletendpointRequestInitializer outletendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(outletendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}