//Filterfunktion für die Tabelle über Land//
function filterTable(searchLand) {
    
    // Variable mit Wert der Nutzereingabe von Feld searchLand //
    var searchLandElement = document.getElementById("searchLand");
    // Varibale mit Wert der Nutzereingabe in Großbuchstaben konvertiert //
    var filterLand = searchLandElement.value.toUpperCase();
    // Variable mit der zu filternden Tabelle //
    var table = document.getElementById("emissionstabel");
    // Variable mit den Zeilen der zu filternden Tabelle //
    var tr = table.getElementsByTagName("tr");
    
    // Schleife zum Durchlaufen aller Tabellenzeilen//
    for (var i = 0; i < tr.length; i++) {
        // Variable mit Wert der ersten Spalte in der aktuellen Zeile //
        var tdLand = tr[i].getElementsByTagName("td")[0];
    
    // Prüft, ob die Zeile Gültig ist (Wert für Land vorhanden) //
    if (tdLand) {
        // Inhalt der jeweiligen Spalte der aktuellen Zeile als Variable gespeichert (textContent oder innerText, je nach Darstellung im Browser) //
        var txtValueLand = tdLand.textContent || tdLand.innerText;
        // Prüft Bedingungen (vgl. in Großbuchstaben): Ist der gesuchte Filterwert/Substring in der jeweiligen Spalte der Zeile enthalten? //
        if (txtValueLand.toUpperCase().indexOf(filterLand) > -1) {
            // Einblenden, wenn Bedingungen stimmen //
            tr[i].style.display = "";
        } 
        // Ausblenden, wenn Bedingungen nicht stimmen //
        else {
            tr[i].style.display = "none";
        }
    }
    }
}