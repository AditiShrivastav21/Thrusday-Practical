const colors = ["green", "red", "rgba(133, 122, 200)", "#f15025"];
const btn = document.getElementById("btn");
const btnCopy = document.getElementById("btnCopy");
const colorValue = document.getElementById("colorValue");
const historyList = document.getElementById("historyList");

btn.addEventListener("click", function() {
  const randomNumber = getRandomNumber();
  const newColor = colors[randomNumber];

  // Check if the color is already in the history, if not, add it
  if (!historyList.querySelector(`[data-color="${newColor}"]`)) {
    const li = document.createElement("li");
    li.textContent = newColor;
    li.setAttribute("data-color", newColor);
    li.style.color = newColor;
    historyList.appendChild(li);
  }

  colorValue.textContent = newColor;
  document.body.style.backgroundColor = newColor;
});

btnCopy.addEventListener("click", function() {
  const colorToCopy = colorValue.textContent;

  // Create a temporary input element to copy the color to clipboard
  const tempInput = document.createElement("input");
  document.body.appendChild(tempInput);
  tempInput.value = colorToCopy;
  tempInput.select();
  document.execCommand("copy");
  document.body.removeChild(tempInput);

  alert("Color copied to clipboard: " + colorToCopy);
});

function getRandomNumber() {
  return Math.floor(Math.random() * colors.length);
}
