const data = [
  {
    image: './assets/tshirts.avif',
    name: 'T Shirt',
    price: 40,
    description:
      'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Abnobis, quidem alias minus nulla rerum',
  },
  {
    image: './assets/jackets.jpg',
    name: 'Jackets',
    price: 80,
    description:
      'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Abnobis, quidem alias minus nulla rerum',
  },
  {
    image: './assets/beddings.avif',
    name: 'Beddings',
    price: 100,
    description:
      'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Abnobis, quidem alias minus nulla rerum',
  },
  {
    image: './assets/socks.jpg',
    name: 'Socks',
    price: 40,
    description:
      'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Abnobis, quidem alias minus nulla rerum',
  },
  {
    image: './assets/trousers.avif',
    name: 'Trousers',
    price: 60,
    description:
      'Lorem ipsum dolor sit, amet consectetur adipisicing elit. Abnobis, quidem alias minus nulla rerum',
  },
];

var catalogueItemsContainer = document.querySelector('.catalogue-items');

function createElements (item) {
  return `
    <li class="catalogue-item">
        <div class="catalogue-item__image" 
        style="
            height: 145px; 
            background-image: url(${item.image}); 
            background-position: start; 
            background-size: contain;
            background-repeat: no-repeat;"
        >
        </div>
        <span class="catalogue-item__name">${item.name}</span>
        <span class="catalogue-item__description">${item.description}</span>
        <span class="catalogue-item__price">Ksh. ${item.price}</span>
    </li>
  `;
}
var catalogueItems = data.map(createElements);

function forEachCatalogue(item) {
  catalogueItemsContainer.innerHTML += item;
}

catalogueItems.forEach(forEachCatalogue);
