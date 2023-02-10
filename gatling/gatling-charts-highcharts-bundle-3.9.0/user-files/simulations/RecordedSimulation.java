
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulation extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("http://34.79.243.148:8080")
    .proxy(Proxy("34.79.243.148", 8080))
    .inferHtmlResources()
    .acceptHeader("application/json, text/plain, */*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:109.0) Gecko/20100101 Firefox/109.0");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"),
    Map.entry("Upgrade-Insecure-Requests", "1")
  );
  
  private Map<CharSequence, String> headers_1 = Map.of("Accept", "*/*");
  
  private Map<CharSequence, String> headers_3 = Map.of("Accept", "text/css,*/*;q=0.1");
  
  private Map<CharSequence, String> headers_4 = Map.of("Accept", "image/avif,image/webp,*/*");
  
  private Map<CharSequence, String> headers_17 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "http://34.79.243.148:8080")
  );
  
  private Map<CharSequence, String> headers_18 = Map.of("authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTY3ODU3MDE1N30.VHVeDe4xWOgjZpIbziHGPH6Fv_NVhmKAYh3vH16xLO3ygzUJjXnGrfEiW6tfD5aA6pYpCO04ouoZl_XZTzmyBg");
  
  private Map<CharSequence, String> headers_23 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "http://34.79.243.148:8080"),
    Map.entry("authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTY3ODU3MDE1N30.VHVeDe4xWOgjZpIbziHGPH6Fv_NVhmKAYh3vH16xLO3ygzUJjXnGrfEiW6tfD5aA6pYpCO04ouoZl_XZTzmyBg")
  );


  private ScenarioBuilder scn = scenario("RecordedSimulation")
    .exec(
      http("request_0")
        .get("/")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/runtime.7cbb17a58382fa99.js")
            .headers(headers_1),
          http("request_2")
            .get("/main.5df37fc0d195bfc1.js")
            .headers(headers_1),
          http("request_3")
            .get("/content/css/loading.css")
            .headers(headers_3),
          http("request_4")
            .get("/images/logo-jhipster.png")
            .headers(headers_4)
            .check(status().is(401)),
          http("request_5")
            .get("/polyfills.f33c9acbe5b6586e.js")
            .headers(headers_1),
          http("request_6")
            .get("/content/images/logo-jhipster.png")
            .headers(headers_4),
          http("request_7")
            .get("/styles.ba2e5d9ea866ce22.css")
            .headers(headers_3),
          http("request_8")
            .get("/683.94054533f8844144.js")
            .headers(headers_1),
          http("request_9")
            .get("/favicon.ico")
            .headers(headers_4),
          http("request_10")
            .get("/api/account")
            .check(status().is(401)),
          http("request_11")
            .get("/i18n/en.json?_=565db766813a6dfd13ef8b1641324bcb"),
          http("request_12")
            .get("/management/info"),
          http("request_13")
            .get("/logo-jhipster.6125d9b31ded8344.png")
            .headers(headers_4),
          http("request_14")
            .get("/jhipster_family_member_0.7318c1006d926ede.svg")
            .headers(headers_4)
        )
    )
    .pause(11)
    .exec(
      http("request_15")
        .get("/855.91d34fb976492247.js")
        .headers(headers_1)
        .resources(
          http("request_16")
            .get("/api/account")
            .check(status().is(401))
        )
    )
    .pause(5)
    .exec(
      http("request_17")
        .post("/api/authenticate")
        .headers(headers_17)
        .body(RawFileBody("recordedsimulation/0017_request.json"))
        .resources(
          http("request_18")
            .get("/api/account")
            .headers(headers_18)
        )
    )
    .pause(18)
    .exec(
      http("request_19")
        .get("/94.17d716a368514f2e.js")
        .headers(headers_1)
        .resources(
          http("request_20")
            .get("/98.0233348fa8e34c5b.js")
            .headers(headers_1),
          http("request_21")
            .get("/575.3fd400a2599bee96.js")
            .headers(headers_1),
          http("request_22")
            .get("/services/invoice/api/invoices?size=20&sort=id,asc")
            .headers(headers_18)
        )
    )
    .pause(10)
    .exec(
      http("request_23")
        .post("/services/invoice/api/invoices")
        .headers(headers_23)
        .body(RawFileBody("recordedsimulation/0023_request.json"))
        .resources(
          http("request_24")
            .get("/services/invoice/api/invoices?size=20&sort=id,asc")
            .headers(headers_18)
        )
    )
    .pause(11)
    .exec(
      http("request_25")
        .post("/services/invoice/api/invoices")
        .headers(headers_23)
        .body(RawFileBody("recordedsimulation/0025_request.json"))
        .resources(
          http("request_26")
            .get("/services/invoice/api/invoices?size=20&sort=id,asc")
            .headers(headers_18)
        )
    )
    .pause(11)
    .exec(
      http("request_27")
        .post("/services/invoice/api/invoices")
        .headers(headers_23)
        .body(RawFileBody("recordedsimulation/0027_request.json"))
        .resources(
          http("request_28")
            .get("/services/invoice/api/invoices?size=20&sort=id,asc")
            .headers(headers_18)
        )
    )
    .pause(7)
    .exec(
      http("request_29")
        .get("/32.f22a73bf34304c54.js")
        .headers(headers_1)
        .resources(
          http("request_30")
            .get("/services/invoice/api/shipments?size=20&sort=id,asc")
            .headers(headers_18)
        )
    )
    .pause(1)
    .exec(
      http("request_31")
        .get("/services/invoice/api/invoices")
        .headers(headers_18)
    )
    .pause(13)
    .exec(
      http("request_32")
        .post("/services/invoice/api/shipments")
        .headers(headers_23)
        .body(RawFileBody("recordedsimulation/0032_request.json"))
        .resources(
          http("request_33")
            .get("/services/invoice/api/shipments?size=20&sort=id,asc")
            .headers(headers_18)
        )
    )
    .pause(1)
    .exec(
      http("request_34")
        .get("/services/invoice/api/invoices")
        .headers(headers_18)
    )
    .pause(10)
    .exec(
      http("request_35")
        .post("/services/invoice/api/shipments")
        .headers(headers_23)
        .body(RawFileBody("recordedsimulation/0035_request.json"))
        .resources(
          http("request_36")
            .get("/services/invoice/api/shipments?size=20&sort=id,asc")
            .headers(headers_18)
        )
    )
    .pause(1)
    .exec(
      http("request_37")
        .get("/services/invoice/api/invoices")
        .headers(headers_18)
    )
    .pause(15)
    .exec(
      http("request_38")
        .post("/services/invoice/api/shipments")
        .headers(headers_23)
        .body(RawFileBody("recordedsimulation/0038_request.json"))
        .resources(
          http("request_39")
            .get("/services/invoice/api/shipments?size=20&sort=id,asc")
            .headers(headers_18)
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
