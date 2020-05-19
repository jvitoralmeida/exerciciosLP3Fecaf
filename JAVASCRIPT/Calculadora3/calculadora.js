function calcular() {
  var nota1 = document.form.val1.value;
  var nota2 = document.form.val2.value;
  var nota3 = document.form.val3.value;
  var nota4 = document.form.val4.value;

  var media = (parseInt(nota1) + parseInt(nota2) + parseInt(nota3) + parseInt(nota4)) / 4;

  console.log(media);

  alert(`Sua media e: ${media}`);
}
