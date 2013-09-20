# Bukkit Plugin Archetype

This project provides a simple Maven archetype for Bukkit plugins. This
archetype allows to quickly generate a simple Bukkit plugin with a base
class, a plugin.yml-file and an pre-configured pom.xml.

## How to prepare the archetype

To use this archetype you need a Maven installation (version 2 - I recommend
and use 3). Then you need to install the archetype. You can clone the whole
repository and build it with ```mvn install``` or you can configure my private
repository (see below).

If you want to install the artifact from my repo you need to configure your
archetype-catalog.xml (in Windows you find it here: <your-userdir>/.m2/
archetype-catalog.xml). Eventually you need to create a new emtpy file. Now
edit it like this:

```xml
<archetype-catalog>
  ...
  <archetypes>
  	...
  	<archetype>
  		<groupId>de.maxikg</groupId>
  		<artifactId>bukkit-plugin-archetype</artifactId>
  		<version>1.6.4-SNAPSHOT</version> <!-- change this, if you need a newer version if there is something available -->
  		<repository>http://repo.maxikg.de/content/groups/public/</repository>
  	</archetype>
  	...
  </archetypes>
  ...
</archetype-catalog>
```

I increase the version every new minecraft-release. You can add a new
archetype-section with the newer version (recommended) or simply change the
version of the existing section (NOT recommended).

## How to use the archetype

After you install the archetype you can use the following simple command to
generate a new project from the archetype:

```
mvn archetype:generate -DarchetypeGroupId=de.maxikg -DarchetypeArtifactId=bukkit-plugin-archetype
```

After this maven will start an interactive assistent. You need to provide
informations like the groupId, artifactId, version and your package. After this
type "Y" to confirm your input. The console will show something like this:

```
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:2.2:generate (default-cli) @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:2.2:generate (default-cli) @ standalone-pom <<<
[INFO]
[INFO] --- maven-archetype-plugin:2.2:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] Archetype [de.maxikg:bukkit-plugin-archetype:1.6.2-SNAPSHOT] found in catalog local
Define value for property 'groupId': : de.maxikg
Define value for property 'artifactId': : my-plugin
Define value for property 'version':  1.0-SNAPSHOT: :
Define value for property 'package':  de.maxikg: : de.maxikg.myplugin
Confirm properties configuration:
groupId: de.maxikg
artifactId: my-plugin
version: 1.0-SNAPSHOT
package: de.maxikg.myplugin
 Y: : Y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: bukkit-plugin-archetype:1.6.2-SNAPSHOT
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: de.maxikg
[INFO] Parameter: artifactId, Value: my-plugin
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: de.maxikg.myplugin
[INFO] Parameter: packageInPathFormat, Value: de/maxikg/myplugin
[INFO] Parameter: package, Value: de.maxikg.myplugin
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: groupId, Value: de.maxikg
[INFO] Parameter: artifactId, Value: my-plugin
[INFO] project created from Archetype in dir: C:\Users\Max\workspaces\Other\my-plugin
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1:12.369s
[INFO] Finished at: Thu Aug 08 01:57:30 CEST 2013
[INFO] Final Memory: 12M/243M
[INFO] ------------------------------------------------------------------------
```