document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Mencegah form dari pengiriman default

    // Ambil nilai dari form
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;

    // Validasi sederhana
    if (name && email && message) {
        // Tampilkan pesan sukses
        document.getElementById('responseMessage').textContent = 'Pesan Anda telah terkirim!';
        
        // Reset form
        document.getElementById('contactForm').reset();
    } else {
        // Tampilkan pesan error
        document.getElementById('responseMessage').textContent = 'Harap isi semua field!';
    }
});