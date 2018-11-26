/* Automatically generated by GNU msgfmt.  Do not modify!  */
package org.postgresql.translation;
public class messages_fr extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[794];
    t[0] = "";
    t[1] = "Project-Id-Version: head-fr\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2007-07-27 12:27+0200\nLast-Translator: \nLanguage-Team:  <en@li.org>\nLanguage: \nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nX-Generator: KBabel 1.11.4\nPlural-Forms:  nplurals=2; plural=(n > 1);\n";
    t[4] = "DataSource has been closed.";
    t[5] = "DataSource a été fermée.";
    t[18] = "Where: {0}";
    t[19] = "Où : {0}";
    t[26] = "The connection attempt failed.";
    t[27] = "La tentative de connexion a échoué.";
    t[28] = "Currently positioned after the end of the ResultSet.  You cannot call deleteRow() here.";
    t[29] = "Actuellement positionné après la fin du ResultSet. Vous ne pouvez pas appeler deleteRow() ici.";
    t[32] = "Can''t use query methods that take a query string on a PreparedStatement.";
    t[33] = "Impossible d''utiliser les fonctions de requête qui utilisent une chaîne de caractères sur un PreparedStatement.";
    t[36] = "Multiple ResultSets were returned by the query.";
    t[37] = "Plusieurs ResultSets ont été retournés par la requête.";
    t[50] = "Too many update results were returned.";
    t[51] = "Trop de résultats de mise à jour ont été retournés.";
    t[58] = "Illegal UTF-8 sequence: initial byte is {0}: {1}";
    t[59] = "Séquence UTF-8 illégale: le premier octet est {0}: {1}";
    t[66] = "The column name {0} was not found in this ResultSet.";
    t[67] = "Le nom de colonne {0} n''a pas été trouvé dans ce ResultSet.";
    t[70] = "Fastpath call {0} - No result was returned and we expected an integer.";
    t[71] = "Appel Fastpath {0} - Aucun résultat n''a été retourné et nous attendions un entier.";
    t[74] = "Protocol error.  Session setup failed.";
    t[75] = "Erreur de protocole. Ouverture de la session en échec.";
    t[76] = "A CallableStatement was declared, but no call to registerOutParameter(1, <some type>) was made.";
    t[77] = "Un CallableStatement a été déclaré, mais aucun appel à registerOutParameter(1, <un type>) n''a été fait.";
    t[78] = "ResultSets with concurrency CONCUR_READ_ONLY cannot be updated.";
    t[79] = "Les ResultSets avec la concurrence CONCUR_READ_ONLY ne peuvent être mis à jour.";
    t[90] = "LOB positioning offsets start at 1.";
    t[91] = "Les décalages de position des LOB commencent à 1.";
    t[92] = "Internal Position: {0}";
    t[93] = "Position interne : {0}";
    t[96] = "free() was called on this LOB previously";
    t[97] = "free() a été appelée auparavant sur ce LOB";
    t[100] = "Cannot change transaction read-only property in the middle of a transaction.";
    t[101] = "Impossible de changer la propriété read-only d''une transaction au milieu d''une transaction.";
    t[102] = "The JVM claims not to support the {0} encoding.";
    t[103] = "La JVM prétend ne pas supporter l''encodage {0}.";
    t[108] = "{0} function doesn''t take any argument.";
    t[109] = "La fonction {0} n''accepte aucun argument.";
    t[112] = "xid must not be null";
    t[113] = "xid ne doit pas être nul";
    t[114] = "Connection has been closed.";
    t[115] = "La connexion a été fermée.";
    t[122] = "The server does not support SSL.";
    t[123] = "Le serveur ne supporte pas SSL.";
    t[140] = "Illegal UTF-8 sequence: byte {0} of {1} byte sequence is not 10xxxxxx: {2}";
    t[141] = "Séquence UTF-8 illégale: l''octet {0} de la séquence d''octet {1} n''est pas 10xxxxxx: {2}";
    t[148] = "Hint: {0}";
    t[149] = "Indice : {0}";
    t[152] = "Unable to find name datatype in the system catalogs.";
    t[153] = "Incapable de trouver le type de donnée name dans les catalogues systèmes.";
    t[156] = "Unsupported Types value: {0}";
    t[157] = "Valeur de type non supportée : {0}";
    t[158] = "Unknown type {0}.";
    t[159] = "Type inconnu : {0}.";
    t[166] = "{0} function takes two and only two arguments.";
    t[167] = "La fonction {0} n''accepte que deux et seulement deux arguments.";
    t[170] = "Finalizing a Connection that was never closed:";
    t[171] = "Destruction d''une connection qui n''a jamais été fermée:";
    t[180] = "The maximum field size must be a value greater than or equal to 0.";
    t[181] = "La taille maximum des champs doit être une valeur supérieure ou égale à 0.";
    t[186] = "PostgreSQL LOBs can only index to: {0}";
    t[187] = "Les LOB PostgreSQL peuvent seulement s''indicer à: {0}";
    t[194] = "Method {0} is not yet implemented.";
    t[195] = "La fonction {0} n''est pas encore implémentée.";
    t[198] = "Error loading default settings from driverconfig.properties";
    t[199] = "Erreur de chargement des valeurs par défaut depuis driverconfig.properties";
    t[200] = "Results cannot be retrieved from a CallableStatement before it is executed.";
    t[201] = "Les résultats ne peuvent être récupérés à partir d''un CallableStatement avant qu''il ne soit exécuté.";
    t[202] = "Large Objects may not be used in auto-commit mode.";
    t[203] = "Les Large Objects ne devraient pas être utilisés en mode auto-commit.";
    t[208] = "Expected command status BEGIN, got {0}.";
    t[209] = "Attendait le statut de commande BEGIN, obtenu {0}.";
    t[218] = "Invalid fetch direction constant: {0}.";
    t[219] = "Constante de direction pour la récupération invalide : {0}.";
    t[222] = "{0} function takes three and only three arguments.";
    t[223] = "La fonction {0} n''accepte que trois et seulement trois arguments.";
    t[226] = "Error during recover";
    t[227] = "Erreur durant la restauration";
    t[228] = "Cannot update the ResultSet because it is either before the start or after the end of the results.";
    t[229] = "Impossible de mettre à jour le ResultSet car c''est soit avant le début ou après la fin des résultats.";
    t[232] = "Parameter of type {0} was registered, but call to get{1} (sqltype={2}) was made.";
    t[233] = "Un paramètre de type {0} a été enregistré, mais un appel à get{1} (sqltype={2}) a été fait.";
    t[240] = "Cannot establish a savepoint in auto-commit mode.";
    t[241] = "Impossible d''établir un savepoint en mode auto-commit.";
    t[242] = "Cannot retrieve the id of a named savepoint.";
    t[243] = "Impossible de retrouver l''identifiant d''un savepoint nommé.";
    t[244] = "The column index is out of range: {0}, number of columns: {1}.";
    t[245] = "L''indice de la colonne est hors limite : {0}, nombre de colonnes : {1}.";
    t[250] = "Something unusual has occurred to cause the driver to fail. Please report this exception.";
    t[251] = "Quelque chose d''inhabituel a provoqué l''échec du pilote. Veuillez faire un rapport sur cette erreur.";
    t[260] = "Cannot cast an instance of {0} to type {1}";
    t[261] = "Impossible de convertir une instance de {0} vers le type {1}";
    t[264] = "Unknown Types value.";
    t[265] = "Valeur de Types inconnue.";
    t[266] = "Invalid stream length {0}.";
    t[267] = "Longueur de flux invalide {0}.";
    t[272] = "Cannot retrieve the name of an unnamed savepoint.";
    t[273] = "Impossible de retrouver le nom d''un savepoint sans nom.";
    t[274] = "Unable to translate data into the desired encoding.";
    t[275] = "Impossible de traduire les données dans l''encodage désiré.";
    t[276] = "Expected an EOF from server, got: {0}";
    t[277] = "Attendait une fin de fichier du serveur, reçu: {0}";
    t[278] = "Bad value for type {0} : {1}";
    t[279] = "Mauvaise valeur pour le type {0} : {1}";
    t[280] = "The server requested password-based authentication, but no password was provided.";
    t[281] = "Le serveur a demandé une authentification par mots de passe, mais aucun mot de passe n''a été fourni.";
    t[296] = "Truncation of large objects is only implemented in 8.3 and later servers.";
    t[297] = "Le troncage des large objects n''est implémenté que dans les serveurs 8.3 et supérieurs.";
    t[298] = "This PooledConnection has already been closed.";
    t[299] = "Cette PooledConnection a déjà été fermée.";
    t[306] = "Fetch size must be a value greater to or equal to 0.";
    t[307] = "Fetch size doit être une valeur supérieur ou égal à 0.";
    t[312] = "A connection could not be made using the requested protocol {0}.";
    t[313] = "Aucune connexion n''a pu être établie en utilisant le protocole demandé {0}. ";
    t[322] = "There are no rows in this ResultSet.";
    t[323] = "Il n''y pas pas de lignes dans ce ResultSet.";
    t[324] = "Unexpected command status: {0}.";
    t[325] = "Statut de commande inattendu : {0}.";
    t[334] = "Not on the insert row.";
    t[335] = "Pas sur la ligne en insertion.";
    t[344] = "Server SQLState: {0}";
    t[345] = "SQLState serveur : {0}";
    t[348] = "The server''s standard_conforming_strings parameter was reported as {0}. The JDBC driver expected on or off.";
    t[349] = "Le paramètre serveur standard_conforming_strings a pour valeur {0}. Le driver JDBC attend on ou off.";
    t[360] = "The driver currently does not support COPY operations.";
    t[361] = "Le pilote ne supporte pas actuellement les opérations COPY.";
    t[364] = "The array index is out of range: {0}, number of elements: {1}.";
    t[365] = "L''indice du tableau est hors limites : {0}, nombre d''éléments : {1}.";
    t[374] = "suspend/resume not implemented";
    t[375] = "suspend/resume pas implémenté";
    t[378] = "Not implemented: one-phase commit must be issued using the same connection that was used to start it";
    t[379] = "Pas implémenté: le commit à une phase doit avoir lieu en utilisant la même connection que celle où il a commencé";
    t[398] = "Cannot call cancelRowUpdates() when on the insert row.";
    t[399] = "Impossible d''appeler cancelRowUpdates() pendant l''insertion d''une ligne.";
    t[400] = "Cannot reference a savepoint after it has been released.";
    t[401] = "Impossible de référencer un savepoint après qu''il ait été libéré.";
    t[402] = "You must specify at least one column value to insert a row.";
    t[403] = "Vous devez spécifier au moins une valeur de colonne pour insérer une ligne.";
    t[404] = "Unable to determine a value for MaxIndexKeys due to missing system catalog data.";
    t[405] = "Incapable de déterminer la valeur de MaxIndexKeys en raison de données manquante dans lecatalogue système.";
    t[412] = "The JVM claims not to support the encoding: {0}";
    t[413] = "La JVM prétend ne pas supporter l''encodage: {0}";
    t[414] = "{0} function takes two or three arguments.";
    t[415] = "La fonction {0} n''accepte que deux ou trois arguments.";
    t[440] = "Unexpected error writing large object to database.";
    t[441] = "Erreur inattendue pendant l''écriture de large object dans la base.";
    t[442] = "Zero bytes may not occur in string parameters.";
    t[443] = "Zéro octets ne devrait pas se produire dans les paramètres de type chaîne de caractères.";
    t[444] = "A result was returned when none was expected.";
    t[445] = "Un résultat a été retourné alors qu''aucun n''était attendu.";
    t[450] = "ResultSet is not updateable.  The query that generated this result set must select only one table, and must select all primary keys from that table. See the JDBC 2.1 API Specification, section 5.6 for more details.";
    t[451] = "Le ResultSet n''est pas modifiable. La requête qui a généré ce résultat doit sélectionner seulement une table, et doit sélectionner toutes les clés primaires de cette table. Voir la spécification de l''API JDBC 2.1, section 5.6 pour plus de détails.";
    t[454] = "Bind message length {0} too long.  This can be caused by very large or incorrect length specifications on InputStream parameters.";
    t[455] = "La longueur du message de liaison {0} est trop grande. Cela peut être causé par des spécification de longueur très grandes ou incorrectes pour les paramètres de type InputStream.";
    t[460] = "Statement has been closed.";
    t[461] = "Statement a été fermé.";
    t[462] = "No value specified for parameter {0}.";
    t[463] = "Pas de valeur spécifiée pour le paramètre {0}.";
    t[468] = "The array index is out of range: {0}";
    t[469] = "L''indice du tableau est hors limites : {0}";
    t[474] = "Unable to bind parameter values for statement.";
    t[475] = "Incapable de lier les valeurs des paramètres pour la commande.";
    t[476] = "Can''t refresh the insert row.";
    t[477] = "Impossible de rafraîchir la ligne insérée.";
    t[480] = "No primary key found for table {0}.";
    t[481] = "Pas de clé primaire trouvée pour la table {0}.";
    t[482] = "Cannot change transaction isolation level in the middle of a transaction.";
    t[483] = "Impossible de changer le niveau d''isolation des transactions au milieu d''une transaction.";
    t[498] = "Provided InputStream failed.";
    t[499] = "L''InputStream fourni a échoué.";
    t[500] = "The parameter index is out of range: {0}, number of parameters: {1}.";
    t[501] = "L''indice du paramètre est hors limites : {0}, nombre de paramètres : {1}.";
    t[502] = "The server''s DateStyle parameter was changed to {0}. The JDBC driver requires DateStyle to begin with ISO for correct operation.";
    t[503] = "Le paramètre DateStyle du serveur a été changé pour {0}. Le pilote JDBC nécessite que DateStyle commence par ISO pour un fonctionnement correct.";
    t[508] = "Connection attempt timed out.";
    t[509] = "La tentative de connexion a échoué dans le délai imparti.";
    t[512] = "Internal Query: {0}";
    t[513] = "Requête interne: {0}";
    t[518] = "The authentication type {0} is not supported. Check that you have configured the pg_hba.conf file to include the client''s IP address or subnet, and that it is using an authentication scheme supported by the driver.";
    t[519] = "Le type d''authentification {0} n''est pas supporté. Vérifiez que vous avez configuré le fichier pg_hba.conf pour inclure l''adresse IP du client ou le sous-réseau et qu''il utilise un schéma d''authentification supporté par le pilote.";
    t[526] = "Interval {0} not yet implemented";
    t[527] = "L''interval {0} n''est pas encore implémenté";
    t[532] = "Conversion of interval failed";
    t[533] = "La conversion de l''intervalle a échoué";
    t[540] = "Query timeout must be a value greater than or equals to 0.";
    t[541] = "Query timeout doit être une valeur supérieure ou égale à 0.";
    t[542] = "Connection has been closed automatically because a new connection was opened for the same PooledConnection or the PooledConnection has been closed.";
    t[543] = "La connexion a été fermée automatiquement car une nouvelle connexion a été ouverte pour la même PooledConnection ou la PooledConnection a été fermée.";
    t[544] = "ResultSet not positioned properly, perhaps you need to call next.";
    t[545] = "Le ResultSet n''est pas positionné correctement, vous devez peut-être appeler next().";
    t[550] = "This statement has been closed.";
    t[551] = "Ce statement a été fermé.";
    t[552] = "Can''t infer the SQL type to use for an instance of {0}. Use setObject() with an explicit Types value to specify the type to use.";
    t[553] = "Impossible de déduire le type SQL à utiliser pour une instance de {0}. Utilisez setObject() avec une valeur de type explicite pour spécifier le type à utiliser.";
    t[554] = "Cannot call updateRow() when on the insert row.";
    t[555] = "Impossible d''appeler updateRow() tant que l''on est sur la ligne insérée.";
    t[562] = "Detail: {0}";
    t[563] = "Détail : {0}";
    t[566] = "Cannot call deleteRow() when on the insert row.";
    t[567] = "Impossible d''appeler deleteRow() pendant l''insertion d''une ligne.";
    t[568] = "Currently positioned before the start of the ResultSet.  You cannot call deleteRow() here.";
    t[569] = "Actuellement positionné avant le début du ResultSet. Vous ne pouvez pas appeler deleteRow() ici.";
    t[576] = "Illegal UTF-8 sequence: final value is a surrogate value: {0}";
    t[577] = "Séquence UTF-8 illégale: la valeur finale est une valeur de remplacement: {0}";
    t[578] = "Unknown Response Type {0}.";
    t[579] = "Type de réponse inconnu {0}.";
    t[582] = "Unsupported value for stringtype parameter: {0}";
    t[583] = "Valeur non supportée pour les paramètre de type chaîne de caractères : {0}";
    t[584] = "Conversion to type {0} failed: {1}.";
    t[585] = "La conversion vers le type {0} a échoué : {1}.";
    t[586] = "Conversion of money failed.";
    t[587] = "La conversion de money a échoué.";
    t[600] = "Unable to load the class {0} responsible for the datatype {1}";
    t[601] = "Incapable de charger la classe {0} responsable du type de données {1}";
    t[604] = "The fastpath function {0} is unknown.";
    t[605] = "La fonction fastpath {0} est inconnue.";
    t[608] = "Malformed function or procedure escape syntax at offset {0}.";
    t[609] = "Syntaxe de fonction ou d''échappement de procédure malformée à l''indice {0}.";
    t[612] = "Provided Reader failed.";
    t[613] = "Le Reader fourni a échoué.";
    t[614] = "Maximum number of rows must be a value grater than or equal to 0.";
    t[615] = "Le nombre maximum de lignes doit être une valeur supérieure ou égale à 0.";
    t[616] = "Failed to create object for: {0}.";
    t[617] = "Échec à la création de l''objet pour : {0}.";
    t[622] = "Premature end of input stream, expected {0} bytes, but only read {1}.";
    t[623] = "Fin prématurée du flux en entrée, {0} octets attendus, mais seulement {1} lus.";
    t[626] = "An unexpected result was returned by a query.";
    t[627] = "Un résultat inattendu a été retourné par une requête.";
    t[646] = "An error occurred while setting up the SSL connection.";
    t[647] = "Une erreur s''est produite pendant l''établissement de la connexion SSL.";
    t[654] = "Illegal UTF-8 sequence: {0} bytes used to encode a {1} byte value: {2}";
    t[655] = "Séquence UTF-8 illégale: {0} octets utilisé pour encoder une valeur à {1} octets: {2}";
    t[658] = "The SSLSocketFactory class provided {0} could not be instantiated.";
    t[659] = "La classe SSLSocketFactory fournie {0} n''a pas pu être instanciée.";
    t[670] = "Position: {0}";
    t[671] = "Position : {0}";
    t[676] = "Location: File: {0}, Routine: {1}, Line: {2}";
    t[677] = "Localisation : Fichier : {0}, Routine : {1}, Ligne : {2}";
    t[684] = "Cannot tell if path is open or closed: {0}.";
    t[685] = "Impossible de dire si path est fermé ou ouvert : {0}.";
    t[700] = "Cannot convert an instance of {0} to type {1}";
    t[701] = "Impossible de convertir une instance de type {0} vers le type {1}";
    t[710] = "{0} function takes four and only four argument.";
    t[711] = "La fonction {0} n''accepte que quatre et seulement quatre arguments.";
    t[718] = "Interrupted while attempting to connect.";
    t[719] = "Interrompu pendant l''établissement de la connexion.";
    t[722] = "Illegal UTF-8 sequence: final value is out of range: {0}";
    t[723] = "Séquence UTF-8 illégale: la valeur finale est en dehors des limites: {0}";
    t[728] = "Failed to initialize LargeObject API";
    t[729] = "Échec à l''initialisation de l''API LargeObject";
    t[734] = "No function outputs were registered.";
    t[735] = "Aucune fonction outputs n''a été enregistrée.";
    t[736] = "{0} function takes one and only one argument.";
    t[737] = "La fonction {0} n''accepte qu''un et un seul argument.";
    t[744] = "This ResultSet is closed.";
    t[745] = "Ce ResultSet est fermé.";
    t[746] = "Invalid character data was found.  This is most likely caused by stored data containing characters that are invalid for the character set the database was created in.  The most common example of this is storing 8bit data in a SQL_ASCII database.";
    t[747] = "Des données de caractères invalides ont été trouvées. C''est probablement causé par le stockage de caractères invalides pour le jeu de caractères de création de la base. L''exemple le plus courant est le stockage de données 8bit dans une base SQL_ASCII.";
    t[750] = "An I/O error occurred while sending to the backend.";
    t[751] = "Une erreur d''entrée/sortie a eu lieu lors d''envoi vers le serveur.";
    t[752] = "Error disabling autocommit";
    t[753] = "Erreur en désactivant autocommit";
    t[754] = "Ran out of memory retrieving query results.";
    t[755] = "Ai manqué de mémoire en récupérant les résultats de la requête.";
    t[756] = "Returning autogenerated keys is not supported.";
    t[757] = "Le renvoi des clés automatiquement générées n''est pas supporté.";
    t[760] = "Operation requires a scrollable ResultSet, but this ResultSet is FORWARD_ONLY.";
    t[761] = "L''opération nécessite un scrollable ResultSet, mais ce ResultSet est FORWARD_ONLY.";
    t[762] = "A CallableStatement function was executed and the out parameter {0} was of type {1} however type {2} was registered.";
    t[763] = "Une fonction CallableStatement a été exécutée et le paramètre en sortie {0} était du type {1} alors que le type {2} était prévu.";
    t[768] = "Unknown ResultSet holdability setting: {0}.";
    t[769] = "Paramètre holdability du ResultSet inconnu : {0}.";
    t[772] = "Transaction isolation level {0} not supported.";
    t[773] = "Le niveau d''isolation de transaction {0} n''est pas supporté.";
    t[774] = "Zero bytes may not occur in identifiers.";
    t[775] = "Des octects à 0 ne devraient pas apparaître dans les identifiants.";
    t[776] = "No results were returned by the query.";
    t[777] = "Aucun résultat retourné par la requête.";
    t[778] = "A CallableStatement was executed with nothing returned.";
    t[779] = "Un CallableStatement a été exécuté mais n''a rien retourné.";
    t[780] = "wasNull cannot be call before fetching a result.";
    t[781] = "wasNull ne peut pas être appelé avant la récupération d''un résultat.";
    t[786] = "This statement does not declare an OUT parameter.  Use '{' ?= call ... '}' to declare one.";
    t[787] = "Cette requête ne déclare pas de paramètre OUT. Utilisez '{' ?= call ... '}' pour en déclarer un.";
    t[788] = "Can''t use relative move methods while on the insert row.";
    t[789] = "Impossible d''utiliser les fonctions de déplacement relatif pendant l''insertion d''une ligne.";
    t[792] = "Connection is busy with another transaction";
    t[793] = "La connection est occupée avec une autre transaction";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 397) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 395) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 794)
        idx -= 794;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 794 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 794);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 794 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}