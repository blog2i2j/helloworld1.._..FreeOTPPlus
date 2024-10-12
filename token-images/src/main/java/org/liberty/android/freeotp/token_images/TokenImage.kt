package org.liberty.android.freeotp.token_images

import java.util.*

enum class TokenImage(val resource: Int,
                      val issuer: String? = null,
                      val alsoMatchLabel: Boolean = false) {
    OneAndOne(R.drawable.token_image_1and1),
    OnePassword(R.drawable.token_image_1password),
    TwentyThreeAndMe(R.drawable.token_image_23andme),
    Adafruit(R.drawable.token_image_adafruit),
    AdGuard(R.drawable.token_image_adguard),
    Adobe(R.drawable.token_image_adobe),
    AirBNB(R.drawable.token_image_airbnb),
    Airbrake(R.drawable.token_image_airbrake),
    AirTable(R.drawable.token_image_airtable),
    AllegroPl(R.drawable.token_image_allegropl),
    Alwaysdata(R.drawable.token_image_alwaysdata),
    Amazon(R.drawable.token_image_amazon),
    AmazonWebServices(R.drawable.token_image_amazonwebservices),
    AngelList(R.drawable.token_image_angellist),
    AnimeBytes(R.drawable.token_image_animebytes),
    Anonaddy(R.drawable.token_image_anonaddy),
    Apache(R.drawable.token_image_apache),
    Apple(R.drawable.token_image_apple),
    Appveyor(R.drawable.token_image_appveyor),
    ArenaNet(R.drawable.token_image_arenanet),
    AtlanticNet(R.drawable.token_image_atlantic_net),
    Atlassian(R.drawable.token_image_atlassian),
    Authentik(R.drawable.token_image_authentik),
    AVM(R.drawable.token_image_avm),
    Backblaze(R.drawable.token_image_backblaze),
    BattleNet(R.drawable.token_image_battlenet),
    Betterment(R.drawable.token_image_betterment),
    Binance(R.drawable.token_image_binance),
    BitBucket(R.drawable.token_image_bitbucket),
    Bitcoin(R.drawable.token_image_bitcoin),
    Bitdefender(R.drawable.token_image_bitdefender),
    Bitfinex(R.drawable.token_image_bitfinex),
    Bitmex(R.drawable.token_image_bitmex),
    Bitpanda(R.drawable.token_image_bitpanda),
    Bitstamp(R.drawable.token_image_bitstamp),
    Bittrex(R.drawable.token_image_bittrex),
    Bitwala(R.drawable.token_image_bitwala),
    Bitwarden(R.drawable.token_image_bitwarden),
    BlockchainInfo(R.drawable.token_image_blockchain_info),
    Bugcrowd(R.drawable.token_image_bugcrowd),
    CEXio(R.drawable.token_image_cexio),
    ChurchTools(R.drawable.token_image_church_tools),
    Cisco(R.drawable.token_image_cisco),
    CloudDownload(R.drawable.token_image_cloud_download),
    Cloudflare(R.drawable.token_image_cloudflare),
    Cobranded(R.drawable.token_image_cobranded),
    Codegiant(R.drawable.token_image_codegiant),
    Coinbase(R.drawable.token_image_coinbase),
    CoinJar(R.drawable.token_image_coinjar),
    ComputerBase(R.drawable.token_image_computerbase),
    ConnectWiseManage(R.drawable.token_image_connectwise_manage),
    CozyCloud(R.drawable.token_image_cozycloud),
    Crowdin(R.drawable.token_image_crowdin),
    Dashlane(R.drawable.token_image_dashlane),
    Debian(R.drawable.token_image_debian),
    Degiro(R.drawable.token_image_degiro),
    Denic(R.drawable.token_image_denic),
    DeutscheBahn(R.drawable.token_image_deutsche_bahn, "Deutsche Bahn"),
    Diaspora(R.drawable.token_image_diaspora),
    Digidentity(R.drawable.token_image_digidentity),
    DigitalOcean(R.drawable.token_image_digital_ocean),
    Discord(R.drawable.token_image_discord),
    Discourse(R.drawable.token_image_discourse),
    Disroot(R.drawable.token_image_disroot),
    Docker(R.drawable.token_image_docker),
    DocuSign(R.drawable.token_image_docusign),
    DreamHost(R.drawable.token_image_dreamhost),
    Dropbox(R.drawable.token_image_dropbox),
    Drupal(R.drawable.token_image_drupal),
    ElectronicArts(R.drawable.token_image_electronic_arts),
    Email(R.drawable.token_image_email),
    EpicGames(R.drawable.token_image_epic_games),
    Etsy(R.drawable.token_image_etsy),
    Eveonline(R.drawable.token_image_eveonline),
    Evernote(R.drawable.token_image_evernote),
    Facebook(R.drawable.token_image_facebook),
    FACEIT(R.drawable.token_image_faceit),
    Fanatical(R.drawable.token_image_fanatical),
    Fastmail(R.drawable.token_image_fastmail),
    Figma(R.drawable.token_image_figma),
    Fingerprint(R.drawable.token_image_fingerprint),
    Finnair(R.drawable.token_image_finnair),
    Firefox(R.drawable.token_image_firefox),
    Flight(R.drawable.token_image_flight_takeoff),
    Floatplane(R.drawable.token_image_floatplane),
    Friendica(R.drawable.token_image_friendica),
    Fritz(R.drawable.token_image_fritz),
    Gamepad(R.drawable.token_image_gamepad),
    Gandi(R.drawable.token_image_gandi),
    Gitea(R.drawable.token_image_gitea),
    GitHub(R.drawable.token_image_github, null, true),
    GitLab(R.drawable.token_image_gitlab),
    Git(R.drawable.token_image_git),
    GMX(R.drawable.token_image_gmx),
    GoDaddy(R.drawable.token_image_godaddy),
    Gogs(R.drawable.token_image_gogs),
    Google(R.drawable.token_image_google),
    GovUK(R.drawable.token_image_govuk),
    Grav(R.drawable.token_image_grav),
    Greenhost(R.drawable.token_image_greenhost),
    HackerOne(R.drawable.token_image_hackerone),
    Heroku(R.drawable.token_image_heroku),
    Hetzner(R.drawable.token_image_hetzner),
    HitBTC(R.drawable.token_image_hitbtc),
    HMRC(R.drawable.token_image_hmrc),
    HomeAssistant(R.drawable.token_image_home_assistant),
    Hover(R.drawable.token_image_hover),
    HumbleBundle(R.drawable.token_image_humblebundle),
    HurricaneElectric(R.drawable.token_image_hurricane_electric),
    IBM(R.drawable.token_image_ibm),
    Iconomi(R.drawable.token_image_iconomi),
    IFTTT(R.drawable.token_image_ifttt),
    ING(R.drawable.token_image_ing),
    Instagram(R.drawable.token_image_instagram),
    INWX(R.drawable.token_image_inwx),
    Itchio(R.drawable.token_image_itchio),
    Jagex(R.drawable.token_image_jagex),
    JetBrains(R.drawable.token_image_jetbrains),
    Joomla(R.drawable.token_image_joomla),
    Keeper(R.drawable.token_image_keeper),
    Kickstarter(R.drawable.token_image_kickstarter),
    Kraken(R.drawable.token_image_kraken),
    Kucoin(R.drawable.token_image_kucoin),
    LastPass(R.drawable.token_image_lastpass),
    LibreNMS(R.drawable.token_image_librenms),
    Lichess(R.drawable.token_image_lichess),
    LinkedIn(R.drawable.token_image_linkedin),
    Linode(R.drawable.token_image_linode),
    Liqui(R.drawable.token_image_liqui),
    LivelyMe(R.drawable.token_image_livelyme),
    Lobsters(R.drawable.token_image_lobsters),
    LocalBitcoins(R.drawable.token_image_localbitcoins),
    LocalMonero(R.drawable.token_image_localmonero),
    LoginGov(R.drawable.token_image_login_gov, "login.gov"),
    LogMeIn(R.drawable.token_image_logmein),
    Mailbox(R.drawable.token_image_mailbox),
    Mailchimp(R.drawable.token_image_mailchimp),
    Mailcow(R.drawable.token_image_mailcow),
    Mailgun(R.drawable.token_image_mailgun),
    Mailru(R.drawable.token_image_mailru),
    Mapbox(R.drawable.token_image_mapbox),
    Mastodon(R.drawable.token_image_mastodon),
    Matomo(R.drawable.token_image_matomo),
    Mega(R.drawable.token_image_mega),
    MercadoLibre(R.drawable.token_image_mercadolibre),
    Microsoft(R.drawable.token_image_microsoft),
    MicrosoftTeams(R.drawable.token_image_microsoft_teams),
    Migadu(R.drawable.token_image_migadu),
    Milesandmore(R.drawable.token_image_miles_and_more, "Miles & More"),
    Mint(R.drawable.token_image_mint),
    Miraheze(R.drawable.token_image_miraheze),
    Mixer(R.drawable.token_image_mixer),
    MongoDB(R.drawable.token_image_mongodb),
    MVPSnet(R.drawable.token_image_mvpsnet),
    NameCheap(R.drawable.token_image_namecheap),
    NameCom(R.drawable.token_image_namecom),
    NAS(R.drawable.token_image_nas),
    netcup(R.drawable.token_image_netcup),
    NextCloud(R.drawable.token_image_nextcloud),
    Nintendo(R.drawable.token_image_nintendo),
    NoStarchPress(R.drawable.token_image_no_starch_press),
    NPM(R.drawable.token_image_npm),
    Oculus(R.drawable.token_image_oculus),
    Office(R.drawable.token_image_office),
    Okta(R.drawable.token_image_okta),
    OnlineNet(R.drawable.token_image_online),
    OpenVZ(R.drawable.token_image_openvz),
    OPNsense(R.drawable.token_image_opnsense),
    ORCiD(R.drawable.token_image_orcid),
    Origin(R.drawable.token_image_origin),
    OVH(R.drawable.token_image_ovh),
    Packet(R.drawable.token_image_packet),
    Parsecgaming(R.drawable.token_image_parsecgaming),
    Passwordstate(R.drawable.token_image_passwordstate),
    Patreon(R.drawable.token_image_patreon),
    PayPal(R.drawable.token_image_paypal),
    PaySafe(R.drawable.token_image_paysafecard),
    PayWithPrivacy(R.drawable.token_image_paywithprivacy),
    PCloud(R.drawable.token_image_pcloud),
    Phabricator(R.drawable.token_image_phabricator),
    phpMyAdmin(R.drawable.token_image_phpmyadmin),
    Pluralsight(R.drawable.token_image_pluralsight),
    Plurk(R.drawable.token_image_plurk),
    Posteo(R.drawable.token_image_posteo),
    Pretix(R.drawable.token_image_pretix),
    Prey(R.drawable.token_image_prey),
    PrivateInternetAccess(R.drawable.token_image_private_internet_access),
    ProtonMail(R.drawable.token_image_protonmail),
    Proxmox(R.drawable.token_image_proxmox),
    Pushover(R.drawable.token_image_pushover),
    PyPI(R.drawable.token_image_pypi),
    PythonAnywhere(R.drawable.token_image_python_anywhere),
    Rackspace(R.drawable.token_image_rackspace),
    Reddit(R.drawable.token_image_reddit),
    Revolt(R.drawable.token_image_revolt),
    RipeNNC(R.drawable.token_image_ripe_ncc),
    Ripio(R.drawable.token_image_ripio),
    Rocketbeanstv(R.drawable.token_image_rocketbeanstv, "rocketbeans.tv"),
    Robinhood(R.drawable.token_image_robinhood),
    Rockstar(R.drawable.token_image_rockstar),
    RSS(R.drawable.token_image_rss),
    SAP(R.drawable.token_image_sap),
    Scaleway(R.drawable.token_image_scaleway),
    School(R.drawable.token_image_school),
    Sciebo(R.drawable.token_image_sciebo),
    Sentry(R.drawable.token_image_sentry),
    Sevdesk(R.drawable.token_image_sevdesk),
    Skrill(R.drawable.token_image_skrill),
    Slack(R.drawable.token_image_slack),
    Snapchat(R.drawable.token_image_snapchat),
    Sophos(R.drawable.token_image_sophos),
    SourceForge(R.drawable.token_image_sourceforge),
    Squarespace(R.drawable.token_image_squarespace),
    StandardNotes(R.drawable.token_image_standardnotes),
    StarCitizen(R.drawable.token_image_starcitizen),
    Steam(R.drawable.token_image_steam),
    Stripe(R.drawable.token_image_stripe),
    Sync(R.drawable.token_image_sync),
    Synology(R.drawable.token_image_synology),
    TeaHub(R.drawable.token_image_teahub),
    TeamViewer(R.drawable.token_image_teamviewer),
    Terminal(R.drawable.token_image_terminal),
    TodoAlojamiento(R.drawable.token_image_todoalojamiento),
    TransIP(R.drawable.token_image_transip),
    Trello(R.drawable.token_image_trello),
    Tumblr(R.drawable.token_image_tumblr),
    TurboTax(R.drawable.token_image_turbotax),
    Tutanota(R.drawable.token_image_tutanota),
    TUWien(R.drawable.token_image_tuwien_ac_at),
    Twilio(R.drawable.token_image_twilio),
    Twitch(R.drawable.token_image_twitch),
    Twitter(R.drawable.token_image_twitter),
    Uber(R.drawable.token_image_uber),
    UbiquitiNetworks(R.drawable.token_image_ubnt),
    Ubisoft(R.drawable.token_image_ubisoft),
    Unity(R.drawable.token_image_unity),
    UbuntuOne(R.drawable.token_image_ubuntu_one),
    Uphold(R.drawable.token_image_uphold),
    USAA(R.drawable.token_image_usaa),
    VagrantCloud(R.drawable.token_image_vagrant_cloud),
    VEXXHOST(R.drawable.token_image_vexxhost),
    VK(R.drawable.token_image_vk),
    Vultr(R.drawable.token_image_vultr),
    Wallabag(R.drawable.token_image_wallabag),
    Wallet(R.drawable.token_image_wallet),
    Wargaming(R.drawable.token_image_wargaming),
    Wasabi(R.drawable.token_image_wasabi),
    Weclapp(R.drawable.token_image_weclapp),
    Wikimedia(R.drawable.token_image_wikimedia),
    Wordpress(R.drawable.token_image_wordpress),
    Workplace(R.drawable.token_image_workplace),
    Xero(R.drawable.token_image_xero),
    Xerox(R.drawable.token_image_xerox),
    Xing(R.drawable.token_image_xing),
    YandexMoney(R.drawable.token_image_yandex_money),
    Zapier(R.drawable.token_image_zapier),
    Zendesk(R.drawable.token_image_zendesk),
    Zoho(R.drawable.token_image_zoho),
    Zoom(R.drawable.token_image_zoom);
}

fun TokenImage.matchToken(issuer: String?, label: String?): Boolean {
    val issuerToMatch = this.issuer ?: this.name

    val issuerMatched = issuer?.lowercase(Locale.getDefault())
            ?.contains(issuerToMatch.lowercase(Locale.getDefault())) ?: false

    return if (!issuerMatched && this.alsoMatchLabel) {
        label?.toLowerCase(Locale.getDefault())
                ?.contains(issuerToMatch.lowercase(Locale.getDefault())) ?: false
    } else {
        issuerMatched
    }
}

