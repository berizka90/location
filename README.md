<h2>This is a project that, at the request of an IpV4 address,</b>
out of the database gives the city, country and geographic coordinates.</h2>
<p> In order to run the project you need to install MySQL DataBase.
By the link: https://lite.ip2location.com/database/ip-country-region-city-latitude-longitude
you need to download the <b>IPV4 SCV</b> file, unzip it and put it in the project's root folder. 
Next, connect to the database login: root, password: root, and run the script <b>DataBase_creation_script.sql.</b>
In order to view all entries in the database, you must run the project with the parameters: http: // localhost: 8080 / geoip. 
To get the ip address information http: // localhost: 8080 / geoip / {ip} where {ip} for example 1.8.8.8 is IPV4 address</p>
The output is:
{
 "countryCode" : "CN",
  "contryName" : "China",
  "regionName" : "Beijing",
  "cityName" : "Beijing",
  "latitude" : 39.9075,
  "longitude" : 116.39723,
  "ip4" : "17303560",
  "ip4Cunonical" : "1.8.8.8"
}
