//Filterfunktion für die Tabelle über 2 Parameter//
function filterTable(inputLand, inputUnternehmen) {
    
    // Variablen mit Wert der Nutzereingabe von Feld inputLand und inputUnternehmen //
    var inputLandElement = document.getElementById("inputLand");
    var inputUnternehmenElement = document.getElementById("inputUnternehmen");
    // Varibalen mit Werten der Nutzereingaben in Großbuchstaben konvertiert //
    var filterLand = inputLandElement.value.toUpperCase();
    var filterUnternehmen = inputUnternehmenElement.value.toUpperCase();
    // Variable mit der zu filternden Tabelle //
    var table = document.getElementById("co2-tabelle");
    // Variable mit den Zeilen der zu filternden Tabelle //
    var tr = table.getElementsByTagName("tr");
    
    // Schleife zum Durchlaufen aller Tabellenzeilen//
    for (var i = 0; i < tr.length; i++) {
        // Variable mit Wert der ersten Spalte in der aktuellen Zeile //
        var tdLand = tr[i].getElementsByTagName("td")[0];
        // Variable mit Wert der zweiten Spalte in der aktuellen Zeile //
        var tdUnternehmen = tr[i].getElementsByTagName("td")[1];
    
    // Prüft, ob die Zeile Gültig ist (Wert für Land und Unternehmen vorhanden) //
    if (tdLand && tdUnternehmen) {
        // Inhalt der jeweiligen Spalte der aktuellen Zeile als Variable gespeichert (textContent oder innerText, je nach Darstellung im Browser) //
        var txtValueLand = tdLand.textContent || tdLand.innerText;
        var txtValueUnternehmen = tdUnternehmen.textContent || tdUnternehmen.innerText;
        // Prüft Bedingungen (vgl. in Großbuchstaben): Ist der gesuchte Filterwert/Substring in der jeweiligen Spalte der Zeile enthalten? //
        if (txtValueLand.toUpperCase().indexOf(filterLand) > -1 && txtValueUnternehmen.toUpperCase().indexOf(filterUnternehmen) > -1) {
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