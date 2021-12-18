var md = window.markdownit();
var div = document.getElementById('mdit');
div.innerHTML = md.render(div.textContent);

