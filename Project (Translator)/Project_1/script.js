const inputBox = document.getElementById("input");
const outputBox = document.getElementById("output");
const languageBox = document.getElementById("languagecode");
const translateButton = document.getElementById("translate");

function httpGet(url) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", url, false );
    xmlHttp.send( null );
    return xmlHttp.responseText;
}
// sends get request to java rest server with the parameters of language and input box
function getTranslation() {
  let translation = httpGet("http://localhost:6969/translate/lc=" + languageBox.value + "/text=" + inputBox.value);
  outputBox.value = translation;
}
// changing translate button on click function to get translation
translateButton.onclick = function(){getTranslation();};
