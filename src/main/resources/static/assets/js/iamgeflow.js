window.onload = function() {
    const container = document.querySelector('.image-flow');
    const images = ['assets/img/home/references/reference1.png', 'assets/img/home/references/reference1.png']; // 이미지 파일명 목록
    let currentIndex = 0;

    function loadImage(index) {
        const img = document.createElement('img');
        img.src = images[index];
        container.appendChild(img);
    }

    function nextImage() {
        if (currentIndex === images.length - 1) {
            currentIndex = 0;
        } else {
            currentIndex++;
        }
        loadImage(currentIndex);
    }

    loadImage(currentIndex);

    setInterval(nextImage, 5000); // 이미지가 5초 간격으로 흐르도록 설정
};